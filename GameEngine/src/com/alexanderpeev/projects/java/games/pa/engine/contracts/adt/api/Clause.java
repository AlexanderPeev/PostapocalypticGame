/**
 * Declares the Clause interface. 
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.api;

import java.util.Comparator;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.exceptions.AggregateException;

/**
 * Models a contract clause, which allows building and verification of contract
 * statements using a fluent interface.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 */
public interface Clause {
	/**
	 * Checks all accumulated conditions and throws the respective exception for
	 * each unsatisfied condition. If more than one condition is not satisfied
	 * an {@link AggregateException} is thrown, containing all sub-exceptions.
	 * 
	 * @exception AggregateException
	 *                When more than one condition is not satisfied.
	 */
	void commit() throws AggregateException;

	/**
	 * Tags this instance with a particular category. Fluent interface - returns
	 * the same instance.
	 * 
	 * @param tag
	 *            The category to tag this instance with.
	 * 
	 * @return This instance.
	 */
	Clause tag(String tag);

	/**
	 * Starts an AND group or resumes the current group, if it is an AND group.
	 * Fluent interface - returns the same instance.
	 * 
	 * @return This instance.
	 */
	Clause all();

	/**
	 * Starts an OR group or resumes the current group, if it is an OR group.
	 * Fluent interface - returns the same instance.
	 * 
	 * @return This instance.
	 */
	Clause any();

	/**
	 * Ends the last started group (optional). Fluent interface - returns the
	 * same instance.
	 * 
	 * @return This instance.
	 */
	Clause group();

	/**
	 * Specifies a condition, which is fulfilled if and only if the value
	 * parameter is null. Fluent interface - returns the same instance.
	 * 
	 * @param value
	 *            The value, which must be null.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable> Clause isNull(Object value) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the value
	 * parameter is not null. Fluent interface - returns the same instance.
	 * 
	 * @param value
	 *            The value, which must be null.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable> Clause isNotNull(Object value) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the value
	 * parameter is true. Fluent interface - returns the same instance.
	 * 
	 * @param value
	 *            The value, which must be null.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable> Clause isTrue(boolean value) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the value
	 * parameter is false. Fluent interface - returns the same instance.
	 * 
	 * @param value
	 *            The value, which must be null.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable> Clause isFalse(boolean value) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is equal to the expected parameter. Fluent interface - returns
	 * the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable> Clause areEqual(Object expected, Object actual)
			throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is not equal to the expected parameter. Fluent interface -
	 * returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable> Clause areNotEqual(Object expected, Object actual)
			throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is same as the expected parameter. Fluent interface - returns
	 * the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable> Clause areSame(Object expected, Object actual)
			throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is not same as the expected parameter. Fluent interface -
	 * returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable> Clause areNotSame(Object expected, Object actual)
			throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is greater than the expected parameter. Fluent interface -
	 * returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable, T extends Comparable<? super T>> Clause isGreaterThan(
			T expected, T actual) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is lesser than the expected parameter. Fluent interface -
	 * returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable, T extends Comparable<? super T>> Clause isLesserThan(
			T expected, T actual) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is greater than or equal to the expected parameter. Fluent
	 * interface - returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable, T extends Comparable<? super T>> Clause isGreaterThanOrEqualTo(
			T expected, T actual) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is lesser than or equal to the expected parameter. Fluent
	 * interface - returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable, T extends Comparable<? super T>> Clause isLesserThanOrEqualTo(
			T expected, T actual) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is greater than the expected parameter. Fluent interface -
	 * returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @param comparator
	 *            The object, used to compare the two tested values.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable, X, T1 extends X, T2 extends X> Clause isGreaterThan(
			T1 expected, T2 actual, Comparator<X> comparator) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is lesser than the expected parameter. Fluent interface -
	 * returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @param comparator
	 *            The object, used to compare the two tested values.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable, X, T1 extends X, T2 extends X> Clause isLesserThan(
			T1 expected, T2 actual, Comparator<X> comparator) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is greater than or equal to the expected parameter. Fluent
	 * interface - returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @param comparator
	 *            The object, used to compare the two tested values.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable, X, T1 extends X, T2 extends X> Clause isGreaterThanOrEqualTo(
			T1 expected, T2 actual, Comparator<X> comparator) throws E;

	/**
	 * Specifies a condition, which is fulfilled if and only if the actual
	 * parameter is lesser than or equal to the expected parameter. Fluent
	 * interface - returns the same instance.
	 * 
	 * @param expected
	 *            The expected value.
	 * @param actual
	 *            The actual value.
	 * @param comparator
	 *            The object, used to compare the two tested values.
	 * @return This instance.
	 * @throws E
	 *             When calling commit, if this condition is not satisfied.
	 */
	<E extends Throwable, X, T1 extends X, T2 extends X> Clause isLesserThanOrEqualTo(
			T1 expected, T2 actual, Comparator<X> comparator) throws E;

	/**
	 * Provides a name for the actual value, supplied in the preceding
	 * condition. Fluent interface - returns the same instance.
	 * 
	 * @param name
	 *            The name of the value.
	 * @return This instance.
	 */
	Clause withActualValueName(String name);

	/**
	 * Provides a name for the expected value, supplied in the preceding
	 * condition. Fluent interface - returns the same instance.
	 * 
	 * @param name
	 *            The name of the value.
	 * @return This instance.
	 */
	Clause withExpectedValueName(String name);

	/**
	 * Provides a message, which should be used in case the preceding condition
	 * is not satisfied. Fluent interface - returns the same instance.
	 * 
	 * @param message
	 *            The message to use in case the preceding condition is not
	 *            satisfied.
	 * @return This instance.
	 */
	Clause withMessage(String message);
}
