/**
 * Declares the MatchingContext&lt;TValue, TResult&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.patterns;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.Iterator;

/**
 * Represents a context for step-wise matching of a data sequence.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface MatchingContext<TValue, TResult> extends Iterator<TValue> {
	/**
	 * Indicates whether or not the current state is stuck, i.e. if the matcher
	 * knows for sure, that further iteration has no chance of matching a
	 * resulting value, without the context being rewinded.
	 * 
	 * @return The value {@literal true} if the state is stuck, or the value
	 *         {@literal false} otherwise.
	 */
	boolean stuck();

	/**
	 * Indicates whether or not this instance has matched a value at the current
	 * state.
	 * 
	 * @return The value {@literal true} if this instance has matched a value at
	 *         the current state, or the value {@literal false} otherwise.
	 */
	boolean matched();

	/**
	 * Indicates the start offset, of the underlying value sequence, where
	 * matching started. The offset positions are zero-indexed.
	 * 
	 * @return The start offset, of the underlying value sequence, where
	 *         matching started. The offset positions are zero-indexed.
	 */
	int matchStart();

	/**
	 * Indicates the current iteration offset. The offset positions are
	 * zero-indexed.
	 * 
	 * @return The current iteration offset. The offset positions are
	 *         zero-indexed.
	 */
	int offset();

	/**
	 * If this instance has matched a value at the current state, the matched
	 * value is returned. If no value is matched, {@literal null} is returned.
	 * 
	 * @return The matched value, or {@literal null}.
	 */
	TResult result();

	/**
	 * Resets the state of the matcher, while preserving the state of the
	 * iteration over the sequence of values.
	 */
	void rewind();
}
