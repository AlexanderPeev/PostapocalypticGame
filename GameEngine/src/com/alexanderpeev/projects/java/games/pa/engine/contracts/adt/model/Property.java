/**
 * Declares the Property&lt;TValue&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models a property, which can be read, assigned to, updated, and cleared. The
 * property also provides a predicate for checking if the property is set.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface Property<TValue> extends ReadableProperty<TValue>,
		MutableProperty<TValue> {
	/**
	 * Only inherited members.
	 */
}
