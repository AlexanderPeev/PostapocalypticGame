/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 8:51:09
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 8:51:09
 */
public interface MutableProperty<TValue> {
	void set(TValue value);

	void clear();

	Event<ValueChangingObservation<MutableProperty<TValue>, TValue>> changing();

	Event<ValueChangedObservation<MutableProperty<TValue>, TValue>> changed();
}
