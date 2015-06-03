/**
 * Declares the Queryable interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.RecordSet;

/**
 * Represents a queryable object, which produces a {@link RecordSet}.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface Queryable {
	/**
	 * Queries this object and provides a new up-to-date {@link RecordSet}.
	 * 
	 * @return A new up-to-date {@link RecordSet}.
	 */
	RecordSet query();
}
