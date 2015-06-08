/**
 * Declares the ValueChangedObservation&lt;TSource, TValue&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models a sourced observation, related to a value change, which exposes the
 * values before and after the change.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface ValueChangedObservation<TSource, TValue> extends
		SourcedObservation<TSource> {
	/**
	 * Exposes the value, as it was before the change.
	 * 
	 * @return The value, as it was before the change.
	 */
	TValue previous();

	/**
	 * Exposes the value, as it is after the change.
	 * 
	 * @return The value, as it is after the change.
	 */
	TValue current();
}
