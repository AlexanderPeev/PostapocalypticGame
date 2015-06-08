/**
 * Declares the Listener&lt;TObservation&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models an event listener for a particular type of observation. This
 * corresponds to an observer in the Observer pattern.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface Listener<TObservation> {
	/**
	 * The listener is notified about an observation by an event it is
	 * subscribed to.
	 * 
	 * @param observation
	 *            The supplied observation, which has occurred at the raised
	 *            event.
	 */
	void observe(TObservation observation);
}
