/**
 * TODO Write file description here. 
 * First generated: 16.06.2015 г. 17:37:31
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.patterns;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 16.06.2015 г. 17:37:31
 */
public interface Matcher<TValue, TResult> {
	MatchingContext<TValue, TResult> match(Iterable<TValue> values);

	Alphabet<TValue> alphabet();
}
