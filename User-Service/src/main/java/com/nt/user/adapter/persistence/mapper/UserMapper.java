package com.nt.user.adapter.persistence.mapper;


import org.mapstruct.Mapper;

import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.user.core.port.user.User;

/**
 * @author Ravi kumar
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(User user);

}
