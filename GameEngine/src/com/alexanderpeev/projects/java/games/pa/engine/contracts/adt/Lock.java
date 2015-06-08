/**
 * TODO Write file description here. 
 * First generated: 7.06.2015 г. 10:47:50
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.exceptions.LockTimeoutException;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 7.06.2015 г. 10:47:50
 */
public interface Lock {
	void read(Action success, Action failure);

	void read(Action success) throws LockTimeoutException;

	// Disposable read() throws LockTimeoutException;

	void update(Action success, Action failure);

	void update(Action success) throws LockTimeoutException;

	// Disposable update() throws LockTimeoutException;
}
