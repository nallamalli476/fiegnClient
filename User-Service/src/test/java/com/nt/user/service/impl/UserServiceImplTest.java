package com.nt.user.service.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.user.core.port.repository.UserPersistencePort;

@ExtendWith(SpringExtension.class)
public class UserServiceImplTest {

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	@Mock
	private UserPersistencePort userPersistencePort;

	@Test
	public void testGetUserDetails() {
		when(userPersistencePort.getUserDetails()).thenReturn(buildUserDetails());
		assertNotNull(userServiceImpl.getUserDetails());
	}

	private List<UserEntity> buildUserDetails() {
		List<UserEntity> listUserDetail = new ArrayList<>();
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName("Ravikumar");
		userEntity.setLastName("Nallamallli");
		userEntity.setUserId("UERID");
		listUserDetail.add(userEntity);
		return listUserDetail;
	}

}
