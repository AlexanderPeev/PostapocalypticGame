/**
 * TODO Write file description here. 
 * First generated: 1.06.2015 г. 22:49:36
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statements;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.Statement;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.components.Table;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Detailable;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Focused;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Limitable;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Orderable;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Selectable;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 1.06.2015 г. 22:49:36
 */
public interface DeleteStatement extends Statement, Focused<Table>, Detailable,
		Selectable, Limitable, Orderable {

}
