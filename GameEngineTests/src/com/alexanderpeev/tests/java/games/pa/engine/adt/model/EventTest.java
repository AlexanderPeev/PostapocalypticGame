/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 21:46:51
 */
package com.alexanderpeev.tests.java.games.pa.engine.adt.model;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.CountableSet;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.Event;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.Listener;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.ReadableProperty;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 21:46:51
 */
public class EventTest {

	public <T> void testEvent(Event<T> event, T observation)
			throws InterruptedException {
		Assert.assertNotNull(event);
		Assert.assertNotNull(observation);

		ReadableProperty<CountableSet<Listener<T>>> property = event
				.listeners();

		Assert.assertNotNull(property);

		CountableSet<Listener<T>> listeners = property.get();

		Assert.assertNotNull(listeners);

		long waitTimeout = 10000, waitIncrement = 1;
		final T obs = observation;
		final Event<T> ev = event;
		final boolean[] raised = new boolean[] { false, false };

		Listener<T> listener = new Listener<T>() {

			@Override
			public void observe(T observation) {
				Assert.assertFalse(raised[0]);
				Assert.assertFalse(raised[1]);

				Assert.assertNotNull(observation);

				Assert.assertSame(obs, observation);

				raised[0] = true;
			}

		};

		Listener<Event<T>> after = new Listener<Event<T>>() {

			@Override
			public void observe(Event<T> event) {
				Assert.assertTrue(raised[0]);
				Assert.assertFalse(raised[1]);

				Assert.assertNotNull(event);

				Assert.assertSame(ev, event);

				raised[1] = true;
			}

		};

		Assert.assertFalse("New listener wrongly reported as present. ",
				listeners.contains(listener));

		Assert.assertTrue(listeners.union(listener));

		Assert.assertTrue("Added listener wrongly reported as absent. ",
				listeners.contains(listener));

		if (event.isSynchronous()) {
			raised[0] = false;
			raised[1] = false;

			event.raise(observation);

			Assert.assertTrue(raised[0]);
			Assert.assertFalse(raised[1]);
		}

		raised[0] = false;
		raised[1] = false;

		event.raise(observation, after);

		long target = System.currentTimeMillis() + waitTimeout;

		while (!raised[1] && System.currentTimeMillis() < target) {
			Thread.sleep(waitIncrement);
		}

		Assert.assertTrue(raised[0]);
		Assert.assertTrue(raised[1]);

		Assert.assertTrue("Added listener wrongly reported as absent. ",
				listeners.contains(listener));

		Assert.assertTrue(listeners.difference(listener));

		Assert.assertFalse("Removed listener wrongly reported as present. ",
				listeners.contains(listener));
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
