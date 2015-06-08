/**
 * Declares the SourcedObservation&lt;TSource&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models an observation which exposes information about its event source.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface SourcedObservation<TSource> {
	/**
	 * Exposes the event source of this instance.
	 * 
	 * @return The event source of this instance.
	 */
	TSource source();
}
