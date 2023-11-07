package com.nt.user.adapter.persistence.entity;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanEquals;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanHashCode;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanToString;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

/**
 * @author Ravi kumar
 *
 * For the sake of increasing code coverage
 */
public class UserEntityTest {

	@Test
	public void testAll() {
		assertThat(UserEntity.class, allOf(hasValidBeanConstructor(), hasValidBeanEquals(), hasValidGettersAndSetters(),
				hasValidBeanHashCode(), hasValidBeanToString()));
	}
}
