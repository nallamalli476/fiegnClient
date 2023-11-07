package com.nt.department.adapter.rest.user;

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

@ExtendWith(SpringExtension.class)
public class UserServiceAdapterTest {

	@Mock
	private UserServiceProxy userServiceProxy;

	@InjectMocks
	private UserServiceAdapter userServiceAdapter;

	@Test
	public void testGetUserDetails() {
		when(userServiceProxy.getUserDetails()).thenReturn(buildUserDetails());
		assertNotNull(userServiceAdapter.getUserDetails());
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
