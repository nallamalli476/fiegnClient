package com.nt.user.adapter.persistence.api;

import java.util.List;
import java.util.Objects;

import javax.persistence.PersistenceException;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.user.adapter.persistence.mapper.UserMapper;
import com.nt.user.adapter.persistence.repository.UserReposistory;
import com.nt.user.core.port.exception.UserPersistenceException;
import com.nt.user.core.port.repository.UserPersistencePort;
import com.nt.user.core.port.user.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ravi kumar
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class UserPersistenceAdapter implements UserPersistencePort {

	private final UserReposistory userReposistory;

	// private final UserMapper mapper;

	@Override
	public List<UserEntity> getUserDetails() {

		return userReposistory.findAll();
	}

	@Override
	public void saveUser(User user) {

		if (Objects.isNull(user)) {
			throw new IllegalArgumentException("user must not be null");
		}

		// UserEntity userEntity = mapper.toEntity(user);

		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setUserId(user.getUserId());

		try {
			userReposistory.save(userEntity);
		} catch (DataAccessException | PersistenceException ex) {
			log.error("{}", ex);
			throw new UserPersistenceException(ex);
		}

	}

}
