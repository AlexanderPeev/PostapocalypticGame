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
 * TODO Write type description here.
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
	Class<? extends ContractDescriptor<?>> descriptor();
}
