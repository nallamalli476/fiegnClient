package com.nt.department.adapter.rest.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nt.department.adapter.rest.user.dto.UserDetails;
import com.nt.department.core.port.UserServicePort;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserServiceAdapter implements UserServicePort {

	private final UserServiceProxy userServiceProxy;

	@Override
	public List<UserDetails> getUserDetails() {
		return userServiceProxy.getUserDetails();
	}

	@Override
	public void createUser(UserDetails userDetails) {
		userServiceProxy.saveUser(userDetails);
	}

}
