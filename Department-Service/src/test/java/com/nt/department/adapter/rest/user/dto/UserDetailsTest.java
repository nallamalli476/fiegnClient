package com.nt.department.adapter.rest.user.dto;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanEquals;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanHashCode;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanToString;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

public class UserDetailsTest {

	@Test
	public void testAll() {
		assertThat(UserDetails.class, allOf(hasValidBeanConstructor(), hasValidBeanEquals(),
				hasValidGettersAndSetters(), hasValidBeanHashCode(), hasValidBeanToString()));
	}
}
