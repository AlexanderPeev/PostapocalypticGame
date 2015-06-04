/**
 * Declares the Event&lt;TObservation&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.CountableSet;

/**
 * Declares a multicast event, which can be raised with a particular
 * observation, and which supports multiple listeners to that observation.
 * Follows the Observer Software Design Pattern.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
// @Contract(descriptor=)
public interface Event<TObservation> {
	/**
	 * Notifies all current listeners with the supplied observation.
	 * 
	 * @param observation
	 *            The supplied observation, with which all current listeners are
	 *            notified.
	 */
	void raise(TObservation observation);

	/**
	 * Notifies all current listeners with the supplied observation. After all
	 * current listeners are notified, the supplied <code>after</code> listener
	 * is also notified.
	 * 
	 * @param observation
	 *            The supplied observation, with which all current listeners are
	 *            notified.
	 * 
	 * @param after
	 *            The supplied after listener
	 */
	void raise(TObservation observation, Listener<Event<TObservation>> after);

	ReadableProperty<CountableSet<Listener<TObservation>>> listeners();

	boolean isSynchronous();
}
