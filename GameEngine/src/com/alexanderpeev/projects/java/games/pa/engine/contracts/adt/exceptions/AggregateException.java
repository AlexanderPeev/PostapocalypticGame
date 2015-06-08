/**
 * TODO Write file description here. 
 * First generated: 4.06.2015 г. 12:05:01
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.exceptions;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.Iterable;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.Iterator;
import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.List;
import com.alexanderpeev.projects.java.games.pa.engine.factories.CollectionFactory;

/**
 * TODO Write type description here.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 4.06.2015 г. 12:05:01
 */
public class AggregateException extends Exception {

	private final Throwable[] inner;

	/**
	 * Getter for the exceptions property.
	 * 
	 * @return The value of the property.
	 */
	public Throwable[] getExceptions() {
		return this.inner;
	}

	/**
	 * TODO Write constructor description here. First generated: 4.06.2015 г.
	 * 12:05:07
	 */
	public AggregateException() {
		this.inner = new Throwable[0];
	}

	public AggregateException(String message) {
		super(message);

		this.inner = new Throwable[0];
	}

	public AggregateException(String message, Throwable[] inner) {
		super(message);

		if (inner == null) {
			this.inner = new Throwable[0];
		}
		else {
			this.inner = inner;
		}
	}

	public AggregateException(String message, Iterable<Throwable> inner) {
		super(message);

		if (inner == null) {
			this.inner = new Throwable[0];
		}
		else {
			List<Throwable> problems = CollectionFactory
					.<Throwable> createList();
			Throwable[] result;

			Iterator<Throwable> iterator = inner.iterate();

			while (iterator.advance()) {
				Throwable current = iterator.current();

				if (current != null) {
					problems.add(current);
				}
			}

			result = new Throwable[problems.size()];

			int index = 0;

			iterator = problems.iterate();

			while (iterator.advance()) {
				Throwable current = iterator.current();

				if (current != null) {
					result[index] = current;

					index += 1;
				}
			}

			this.inner = result;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#toString() First generated: 4.06.2015 г.
	 * 13:33:42
	 */
	@Override
	public String toString() {
		String result;

		StringBuilder sb = new StringBuilder(2 + this.inner.length * 2);

		sb.append(super.toString());

		sb.append(", inner exceptions: ");

		boolean added = false;

		for (int i = 0, len = this.inner.length; i < len; i++) {
			Throwable t = this.inner[i];

			if (t != null) {
				if (added) {
					sb.append(", ");
				}
				else {
					added = true;
				}

				sb.append(t.toString());
			}
		}

		sb.append(". ");

		result = sb.toString();

		return result;
	}
}
