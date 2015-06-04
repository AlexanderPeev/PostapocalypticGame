/**
 * TODO Write file description here. 
 * First generated: 4.06.2015 г. 10:04:10
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 4.06.2015 г. 10:04:10
 */
public interface ContractDescriptor<TModule> {
	boolean canDescribe(TModule instance);

	void checkPreconditions(TModule instance, String method, Object[] arguments);

	void checkPostconditions(TModule instance, String method,
			Object[] arguments, Object result);

	void checkInvariants(TModule instance);
}
