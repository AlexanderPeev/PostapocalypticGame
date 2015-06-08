/**
 * Declares the WithMutablehash&lt;THash, TValue&gt; interface. 
 * First generated: 2.06.2015 г. 8:27:40
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models a hashable object, with a mutable hash value.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface WithMutableHash<THash, TValue> extends Hashable<THash> {
	/**
	 * Exposes the cancellable hash changing event.
	 * 
	 * @return The cancellable hash changing event.
	 */
	Event<ValueChangingObservation<TValue, THash>> hashChanging();

	/**
	 * Exposes the hash changed event.
	 * 
	 * @return The hash changed event.
	 */
	Event<ValueChangedObservation<TValue, THash>> hashChanged();
}
