package com.nt.department.service;

import java.util.List;

import com.nt.department.adapter.rest.user.dto.UserDetails;

public interface DepartmentUseCase {

	public List<UserDetails> getUserDetails();
	public void createUser(UserDetails userDetails);
}
