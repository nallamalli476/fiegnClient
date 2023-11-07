package com.nt.user.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nt.user.adapter.persistence.entity.UserEntity;
import com.nt.user.service.UserServiceUseCase;
import com.nt.userservice.core.usecase.service.user.UserCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(
		value = "/v1/users", 
        consumes = { MediaType.APPLICATION_JSON_VALUE }, 
        produces = {MediaType.APPLICATION_JSON_VALUE })
@RequiredArgsConstructor
@Slf4j
public class UserController {

	private final UserServiceUseCase userService;

	@GetMapping("/getUsers")
	public ResponseEntity<List<UserEntity>> getUserDetails() {
		return ResponseEntity.ok(userService.getUserDetails());
	}

	@PostMapping("/save")
	public ResponseEntity saveUser(@RequestBody UserCommand userCommand) {
		log.info("New request received to user: {}", userCommand);
		userService.saveUser(userCommand);
		return ResponseEntity.accepted().build();
	}

}
