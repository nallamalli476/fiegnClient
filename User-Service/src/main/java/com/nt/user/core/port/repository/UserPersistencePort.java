package com.nt.user.core.port.repository;

import java.util.List;

import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.user.core.port.user.User;

public interface UserPersistencePort {
	
	List<UserEntity> getUserDetails(); 
	void saveUser(User user);

}
