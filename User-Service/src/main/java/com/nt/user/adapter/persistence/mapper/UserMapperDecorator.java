package com.nt.user.adapter.persistence.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.user.core.port.user.User;

/**
 * @author Ravikumar
 */
public abstract class UserMapperDecorator implements UserMapper {

	@Autowired
	@Qualifier("delegate")
	private UserMapper delegate;

	@Override
	public UserEntity toEntity(User model) {

		UserEntity entity = delegate.toEntity(model);

		return entity;
	}

}
