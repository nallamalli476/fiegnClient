package com.nt.department.core.port;

import java.util.List;

import com.nt.department.adapter.rest.user.dto.UserDetails;

public interface UserServicePort {

	public List<UserDetails> getUserDetails();
	public void createUser(UserDetails userDetails);
}
