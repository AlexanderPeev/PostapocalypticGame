/**
 * TODO Write file description here. 
 * First generated: 1.06.2015 г. 22:57:33
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 1.06.2015 г. 22:57:33
 */
public interface Iterator<TValue> {
	boolean advance();

	boolean isValid();

	boolean isConcurrent();

	TValue current();

	void reset();
}
