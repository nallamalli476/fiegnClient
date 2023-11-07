package com.nt.user.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.user.core.port.repository.UserPersistencePort;
import com.nt.user.core.port.user.User;
import com.nt.user.service.UserServiceUseCase;
import com.nt.userservice.core.usecase.service.user.UserCommand;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServiceUseCase {

	private final UserPersistencePort userPersistencePort;

	@Override
	public List<UserEntity> getUserDetails() {

		return userPersistencePort.getUserDetails();
	}

	@Override
	public void saveUser(UserCommand userCommand) {
		User user = User.builder().firstName(userCommand.getFirstName()).lastName(userCommand.getLastName())
				.userId(userCommand.getUserId()).build();
		userPersistencePort.saveUser(user);

	}

}
