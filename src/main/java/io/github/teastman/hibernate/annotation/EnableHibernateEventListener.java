package io.github.teastman.hibernate.annotation;

import io.github.teastman.hibernate.HibernateEventAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 石少东
 * @date 2020-08-15 09:50
 * @since 1.0
 */

@Inherited
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(HibernateEventAutoConfiguration.class)
public @interface EnableHibernateEventListener {
}
