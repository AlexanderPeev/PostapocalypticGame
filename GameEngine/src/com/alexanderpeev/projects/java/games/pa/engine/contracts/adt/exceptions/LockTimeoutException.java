/**
 * Declares the LockTimeoutException class. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.exceptions;

/**
 * Models an exception, throwing which signifies obtaining a lock has failed,
 * due to a waiting period, which was longer than allowed.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public class LockTimeoutException extends Exception {
	/**
	 * Default constructor, no message and no cause is supplied.
	 */
	public LockTimeoutException() {
		super();
	}

	/**
	 * A message is supplied and assigned to this instance. However, no cause is
	 * supplied.
	 * 
	 * @param message
	 *            The supplied detail message.
	 */
	public LockTimeoutException(String message) {
		super(message);
	}

	/**
	 * A cause is supplied and assigned to this instance. However, no message is
	 * supplied.
	 * 
	 * @param cause
	 *            The supplied cause.
	 */
	public LockTimeoutException(Throwable cause) {
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
	public LockTimeoutException(String message, Throwable cause) {
		super(message, cause);
	}
}
