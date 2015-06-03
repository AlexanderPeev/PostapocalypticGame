/**
 * TODO Write file description here. 
 * First generated: 2.06.2015 г. 18:26:59
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 2.06.2015 г. 18:26:59
 */
public interface ListItemIdentifier<TValue> extends ItemIdentifier<TValue> {
	boolean hasPrevious();

	ListItemIdentifier<TValue> previous();

	ListItemIdentifier<TValue> insertBefore(TValue value);

	ListItemIdentifier<TValue> insertAfter(TValue value);

	boolean hasNext();

	ListItemIdentifier<TValue> next();
}
