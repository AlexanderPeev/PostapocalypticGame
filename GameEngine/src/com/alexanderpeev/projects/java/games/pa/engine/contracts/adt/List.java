/**
 * TODO Write file description here. 
 * First generated: 1.06.2015 г. 22:58:31
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 1.06.2015 г. 22:58:31
 */
public interface List<TValue> extends Collection<TValue> {

	ListItemIdentifier<TValue> prepend(TValue value);

	ListItemIdentifier<TValue> append(TValue value);

	ListItemIdentifier<TValue> first();

	ListItemIdentifier<TValue> last();
}
