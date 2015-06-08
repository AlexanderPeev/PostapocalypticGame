/**
 * Declares the ReadableProperty&lt;TValue&gt; interface. 
 * First generated: 2.06.2015 г. 8:50:54
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models a readable property, which can provide a value of a specific type,
 * represented by {@code TValue}.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface ReadableProperty<TValue> {
	/**
	 * Returns whether or not a meaningful value is present in this property.
	 * 
	 * @return Whether or not a meaningful value is present in this property.
	 */
	boolean isSet();

	/**
	 * Returns the current value of the property.
	 * 
	 * @return The current value of the property.
	 */
	TValue get();
}
