/**
 * TODO Write file description here. 
 * First generated: 1.06.2015 г. 23:04:33
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statements;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.components.Table;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Alterable;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Creatable;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Destroyable;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.data.db.statement.variaties.Focused;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 1.06.2015 г. 23:04:33
 */
public interface TableStatement extends Focused<Table>, Alterable, Destroyable,
		Creatable {

}
