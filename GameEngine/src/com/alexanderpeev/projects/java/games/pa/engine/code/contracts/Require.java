/**
 * TODO Write file description here. 
 * First generated: 4.06.2015 г. 12:31:09
 */
package com.alexanderpeev.projects.java.games.pa.engine.code.contracts;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.api.Clause;
import com.alexanderpeev.projects.java.games.pa.engine.factories.ContractFactory;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 4.06.2015 г. 12:31:09
 */
public class Require {
	public static Clause that() {
		return ContractFactory.createPreconditionClause();
	}
}
