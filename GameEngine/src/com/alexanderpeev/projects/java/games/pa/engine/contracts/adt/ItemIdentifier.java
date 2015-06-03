/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 18:11:48
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.Event;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.Property;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.ValueChangedObservation;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 18:11:48
 */
public interface ItemIdentifier<TValue> {
	Property<TValue> item();

	boolean isPresent();

	void remove();

	Event<ValueChangedObservation<ItemIdentifier<TValue>, TValue>> removed();
}
