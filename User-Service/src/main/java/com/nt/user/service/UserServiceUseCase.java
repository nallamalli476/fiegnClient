package com.nt.user.service;

import java.util.List;

import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.userservice.core.usecase.service.user.UserCommand;

public interface UserServiceUseCase {

	public List<UserEntity> getUserDetails();
	
	public void saveUser(UserCommand userCommand);

}
