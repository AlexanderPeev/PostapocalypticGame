/**
 * Declares the ModificationCancelledException class. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.exceptions;

/**
 * Models an exception, throwing which signifies an ongoing modification has
 * been cancelled and rolled back.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public class ModificationCancelledException extends Exception {
	/**
	 * Default constructor, no message and no cause is supplied.
	 */
	public ModificationCancelledException() {
		super();
	}

	/**
	 * A message is supplied and assigned to this instance. However, no cause is
	 * supplied.
	 * 
	 * @param message
	 *            The supplied detail message.
	 */
	public ModificationCancelledException(String message) {
		super(message);
	}

	/**
	 * A cause is supplied and assigned to this instance. However, no message is
	 * supplied.
	 * 
	 * @param cause
	 *            The supplied cause.
	 */
	public ModificationCancelledException(Throwable cause) {
		super(cause);
	}

	/**
	 * A detail message and a cause are supplied and assigned to this instance.
	 * 
	 * @param message
	 *            The supplied detail message.
	 * @param cause
	 *            The supplied cause.
	 */
	public ModificationCancelledException(String message, Throwable cause) {
		super(message, cause);
	}
}
