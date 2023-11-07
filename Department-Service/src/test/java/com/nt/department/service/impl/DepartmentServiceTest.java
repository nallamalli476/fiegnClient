package com.nt.department.service.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nt.department.adapter.rest.user.dto.UserDetails;
import com.nt.department.core.port.UserServicePort;

@ExtendWith(SpringExtension.class)
public class DepartmentServiceTest {

	@InjectMocks
	private DepartmentServiceImpl departmentServiceImpl;

	@Mock
	private UserServicePort userServicePort;

	@Test
	public void testGetUserDetails() {
		when(userServicePort.getUserDetails()).thenReturn(buildUserDetails());
		assertNotNull(departmentServiceImpl.getUserDetails());
	}

	private List<UserDetails> buildUserDetails() {
		List<UserDetails> listUserDetail = new ArrayList<>();
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName("Ravikumar");
		userDetails.setLastName("Nallamallli");
		userDetails.setUserId("UERID");
		listUserDetail.add(userDetails);
		return listUserDetail;
	}

}
