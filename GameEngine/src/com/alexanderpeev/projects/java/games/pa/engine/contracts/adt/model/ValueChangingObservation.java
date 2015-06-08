/**
 * Declares the ValueChangingObservation&lt;TSource, TValue&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models a sourced cancellable observation, which exposes the current value and
 * the value after the change.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface ValueChangingObservation<TSource, TValue> extends
		SourcedObservation<TSource>, CancellableObservation {
	/**
	 * Exposes the current value, i.e. the one before the change.
	 * 
	 * @return The current value, i.e. the one before the change.
	 */
	TValue current();

	/**
	 * Exposes the new value, i.e. the one after the change.
	 * 
	 * @return The new value, i.e. the one after the change.
	 */
	TValue replacement();
}
