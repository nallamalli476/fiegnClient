package com.nt.user.adapter.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.user.adapter.persistence.entity.UserEntity;

/**
 * @author Ravikumar
 */
public interface UserReposistory extends JpaRepository<UserEntity, Long> {

}
