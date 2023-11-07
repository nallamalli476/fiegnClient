package com.nt.department.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.department.adapter.rest.user.dto.UserDetails;
import com.nt.department.core.port.UserServicePort;
import com.nt.department.service.DepartmentUseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentUseCase {

	private final UserServicePort userServicePort;

	@Override
	public List<UserDetails> getUserDetails() {

		return userServicePort.getUserDetails();
	}

	@Override
	public void createUser(UserDetails userDetails) {

		userServicePort.createUser(userDetails);
	}

}
