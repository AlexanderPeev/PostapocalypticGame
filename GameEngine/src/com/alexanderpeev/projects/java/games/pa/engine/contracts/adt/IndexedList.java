/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 18:32:25
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;


/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 18:32:25
 */
public interface IndexedList<TIndex, TValue> extends List<TValue> {
	boolean isValidIndex(TIndex index);

	IndexedListItemIdentifier<TIndex, TValue> getAtIndex(TIndex index);
}
