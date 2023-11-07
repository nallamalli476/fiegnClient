package com.nt.user.adapter.persistence.api;

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
import com.nt.user.adapter.persistence.repository.UserReposistory;


@ExtendWith(SpringExtension.class)
public class UserPersistenceAdapterTest {

	@InjectMocks
	private UserPersistenceAdapter userPersistenceAdapter;

	@Mock
	private UserReposistory userReposistory;

	@Test
	public void testGetUserDetails() {
		when(userReposistory.findAll()).thenReturn(buildUserDetails());
		assertNotNull(userPersistenceAdapter.getUserDetails());

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
