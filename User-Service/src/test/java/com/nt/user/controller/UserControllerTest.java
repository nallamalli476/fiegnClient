package com.nt.user.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.user.service.UserServiceUseCase;

/**
 * @author Ravi kumar
 *
 * For the sake of increasing code coverage
 */
@ExtendWith(SpringExtension.class)
public class UserControllerTest {

	@Mock
	UserServiceUseCase userServiceUseCase;

	@InjectMocks
	UserController userController;

	MockMvc mockMvc;

	private static final String GET_USER_DETAILS = "/v1/users/getUsers";

	@BeforeEach
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}

	@Test
	public void testGetUserDetails() throws Exception {
		when(userServiceUseCase.getUserDetails()).thenReturn(new ArrayList<UserEntity>());
		mockMvc.perform(MockMvcRequestBuilders.get(GET_USER_DETAILS).contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

}
