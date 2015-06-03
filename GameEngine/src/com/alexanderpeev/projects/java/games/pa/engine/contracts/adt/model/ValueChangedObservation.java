/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 9:34:58
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 9:34:58
 */
public interface ValueChangedObservation<TSource, TValue> extends
		SourcedObservation<TSource> {
	TValue previous();

	TValue current();
}
