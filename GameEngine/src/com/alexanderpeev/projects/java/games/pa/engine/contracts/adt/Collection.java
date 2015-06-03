/**
 * TODO Write file description here. 
 * First generated: 1.06.2015 г. 22:57:45
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.Event;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.ValueObservation;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 1.06.2015 г. 22:57:45
 */
public interface Collection<TValue> extends Iterable<TValue> {
	int size();

	boolean isEmpty();

	void empty();

	ItemIdentifier<TValue> add(TValue value);

	boolean remove(ItemIdentifier<TValue> identifier);

	Event<ValueObservation<Collection<TValue>, ItemIdentifier<TValue>>> itemAdded();

	Event<ValueObservation<SourceItemPair<Collection<TValue>, ItemIdentifier<TValue>>, TValue>> itemRemoved();
}
