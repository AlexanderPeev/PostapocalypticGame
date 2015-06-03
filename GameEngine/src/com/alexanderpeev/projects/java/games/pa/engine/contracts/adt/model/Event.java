/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 8:28:05
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.CountableSet;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 8:28:05
 */
public interface Event<TObservation> {
	void raise(TObservation observation);

	void raise(TObservation observation, Listener<Event<TObservation>> after);

	ReadableProperty<CountableSet<Listener<TObservation>>> listeners();

	boolean isSynchronous();
}
