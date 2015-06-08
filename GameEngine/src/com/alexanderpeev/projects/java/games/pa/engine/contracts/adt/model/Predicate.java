/**
 * Declares the Predicate interface. 
 * First generated: 4.06.2015 г. 12:32:38
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models a predicate, which can be evaluated with a boolean result.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface Predicate {
	/**
	 * Evaluates the predicate.
	 * 
	 * @return The boolean result of this instance's evaluation.
	 */
	boolean evaluate();
}
