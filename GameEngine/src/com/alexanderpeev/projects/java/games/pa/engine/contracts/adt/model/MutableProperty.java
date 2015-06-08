/**
 * Declares the MutableProperty&lt;TValue&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.exceptions.ModificationCancelledException;

/**
 * Models a mutable property, i.e. a property, whose value can be altered (it
 * can both be set/updated and cleared). The property also exposes two change
 * events, one of which is cancellable, i.e. it allows listeners to revert a
 * change, made by a call to the set or clear methods.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface MutableProperty<TValue> {
	/**
	 * Assigns a new value to this property.
	 * 
	 * @param value
	 *            The new value, which should be assigned to this property.
	 * @throws ModificationCancelledException
	 *             If one or more listeners to the changing event decide this
	 *             change should not come into effect. In this case, the
	 *             previous value is kept.
	 */
	void set(TValue value) throws ModificationCancelledException;

	/**
	 * Clears the current value from this property, i.e. it is substituted by a
	 * default or uninitialized value.
	 * 
	 * @throws ModificationCancelledException
	 *             If one or more listeners to the changing event decide this
	 *             change should not come into effect. In this case, the
	 *             previous value is kept.
	 */
	void clear() throws ModificationCancelledException;

	/**
	 * Exposes the changing event of this property. The event is fired, after a
	 * modification is requested, but before it comes into effect, which means
	 * the change can be cancelled by any subscribed listener to this property.
	 * 
	 * @return The changing event.
	 */
	Event<ValueChangingObservation<MutableProperty<TValue>, TValue>> changing();

	/**
	 * Exposes the changed event of this property. The event is fired, after a
	 * modification is requested and comes into effect.
	 * 
	 * @return The changed event.
	 */
	Event<ValueChangedObservation<MutableProperty<TValue>, TValue>> changed();
}
