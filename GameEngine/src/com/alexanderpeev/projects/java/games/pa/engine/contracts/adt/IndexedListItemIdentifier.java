/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 18:35:16
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.Event;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.ValueChangedObservation;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.ValueChangingObservation;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 18:35:16
 */
public interface IndexedListItemIdentifier<TIndex, TValue> extends
		ListItemIdentifier<TValue> {
	TIndex index();

	TIndex previousIndex();

	TIndex nextIndex();

	Event<ValueChangingObservation<IndexedListItemIdentifier<TIndex, TValue>, TIndex>> indexChanging();

	Event<ValueChangedObservation<IndexedListItemIdentifier<TIndex, TValue>, TIndex>> indexChanged();
}
