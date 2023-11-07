package com.nt.department.adapter.rest.user;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.department.adapter.rest.user.dto.UserDetails;

import feign.Headers;

@FeignClient(name = "USER-SERVICE", url="http://localhost:7035")
public interface UserServiceProxy {

	String JSON_HEADER = "Content-Type: application/json";
	String AUTHORIZATION = "Authorization";
	
	@RequestMapping(method = RequestMethod.GET, value = "/v1/users/getUsers", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Headers(JSON_HEADER)
	List<UserDetails> getUserDetails();
	
	@RequestMapping(method = RequestMethod.POST, value = "/v1/users/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Headers(JSON_HEADER)
	void saveUser(UserDetails userDetails);
}
