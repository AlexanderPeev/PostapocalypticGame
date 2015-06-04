/**
 * Declares the CancellableObservation interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models an observation, which can be irreversibly cancelled.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface CancellableObservation {
	boolean isCancelled();

	void cancel();
}
