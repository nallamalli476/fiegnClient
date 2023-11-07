package com.nt.department.adapter.rest.user.dto;


import com.nt.department.core.domain.dto.DTO;
import lombok.Data;

@Data
public class UserDetails implements DTO {

	private static final long serialVersionUID = 7816290608173449082L;

    private String userId;

    private String firstName;

    private String lastName;

}
