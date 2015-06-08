/**
 * Declares the ValueObservation&lt;TSource, TValue&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models a sourced observation, which exposes a value.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface ValueObservation<TSource, TValue> extends
		SourcedObservation<TSource> {
	/**
	 * Exposes the value, associated with this observation.
	 * 
	 * @return The value, associated with this observation.
	 */
	TValue value();
}
