/**
 * Declares the MutableSet&lt;TValue&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

/**
 * Models a set, which is mutable and countable (using the Collection
 * interface), i.e. it has a finite number of elements, and basic union and
 * difference operations can be performed on it.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface MutableSet<TValue> extends Set<TValue>, Collection<TValue> {
	/**
	 * Adds the supplied value as an element of this set.
	 * 
	 * @param value
	 *            The supplied value to be added.
	 * @return {@literal true} if the element was not a member of this set,
	 *         prior to this method call, {@literal false} otherwise.
	 */
	boolean union(TValue value);

	/**
	 * Removes the element with the supplied value from this set.
	 * 
	 * @param value
	 *            The supplied value to be removed.
	 * @return {@literal true} if the element was a member of this set, prior to
	 *         this method call, {@literal false} otherwise.
	 */
	boolean difference(TValue value);

	/**
	 * Adds the supplied values as elements of this set.
	 * 
	 * @param values
	 *            The supplied values to be added.
	 */
	void unionAll(Iterable<? extends TValue> values);

	/**
	 * Removes the elements with the supplied values from this set.
	 * 
	 * @param values
	 *            The supplied values to be removed.
	 */
	void differenceAll(Iterable<? extends TValue> values);
}
