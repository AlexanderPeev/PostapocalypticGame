/**
 * Declares the ContractDescriptor&lt;TModule&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface ContractDescriptor<TModule> {
	boolean canDescribe(TModule instance);

	void checkPreconditions(TModule instance, String method, Object[] arguments);

	void checkPostconditions(TModule instance, String method,
			Object[] arguments, Object result);

	void checkInvariants(TModule instance);
}
