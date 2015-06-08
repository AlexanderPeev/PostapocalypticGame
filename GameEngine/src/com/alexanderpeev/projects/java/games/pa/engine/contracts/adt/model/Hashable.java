/**
 * Declares the Hashable&lt;THash&gt; interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model;

/**
 * Models a hashable object, with a hash of a specific type.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface Hashable<THash> {
	/**
	 * Provides the hash value.
	 * 
	 * @return The hash value.
	 */
	THash hash();
}
