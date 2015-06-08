/**
 * TODO Write file description here. 
 * First generated: 3.06.2015 г. 19:24:16
 */
package com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.alexanderpeev.projects.java.games.pa.engine.contracts.adt.model.ContractDescriptor;

/**
 * Annotates a type with a contract descriptor, which can be used.
 * 
 * @author Alexander Peev (user: Alexander Peev)
 *
 *         First generated: 3.06.2015 г. 19:24:16
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.TYPE })
public @interface Contract {
	/**
	 * Specifies a contract descriptor for the annotated type.
	 * 
	 * @return The specified contract descriptor for the annotated type.
	 */
	Class<? extends ContractDescriptor<?>> descriptor();
}
