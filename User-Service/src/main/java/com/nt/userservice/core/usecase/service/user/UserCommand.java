package com.nt.userservice.core.usecase.service.user;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Ravikumar
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCommand implements Serializable{
	
	private static final long serialVersionUID = -3636999178997251142L;
	
	private String userId;
	
	private String firstName;
	
	private String lastName;


}
