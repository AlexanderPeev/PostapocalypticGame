/**
 * TODO Write file description here. 
 * First generated: 1.06.2015 г. 22:58:25
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 1.06.2015 г. 22:58:25
 */
public interface CountableSet<TValue> extends Set<TValue>, Collection<TValue> {
	boolean union(TValue value);

	boolean difference(TValue value);

	void unionAll(Iterable<? extends TValue> values);

	void differenceAll(Iterable<? extends TValue> values);
}
