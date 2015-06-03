/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 8:50:54
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 8:50:54
 */
public interface ReadableProperty<TValue> {
	boolean isSet();

	TValue get();
}
