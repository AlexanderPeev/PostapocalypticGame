/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 18:00:22
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 18:00:22
 */
public interface SetBuilder {
	<TValue> Set<TValue> union(Set<? extends TValue> a, Set<? extends TValue> b);

	<TValue> Set<TValue> intersection(Set<? extends TValue> a,
			Set<? extends TValue> b);

	<TValue> Set<TValue> difference(Set<? extends TValue> a,
			Set<? extends TValue> b);
}
