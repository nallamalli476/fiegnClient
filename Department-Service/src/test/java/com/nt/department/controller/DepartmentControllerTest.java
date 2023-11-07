package com.nt.department.controller;

import static org.mockito.Mockito.when;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.nt.department.adapter.rest.user.dto.UserDetails;
import com.nt.department.service.DepartmentUseCase;

@ExtendWith(SpringExtension.class)
public class DepartmentControllerTest {

	@Mock
	DepartmentUseCase departmentService;

	@InjectMocks
	DepartmentController departmentController;

	MockMvc mockMvc;

	private static final String GET_USER_DETAILS = "/v1/depart/users/getUsers";
	

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders
            .standaloneSetup(departmentController)
            //.setControllerAdvice(new RestControllerExceptionHandler())
            .build();
    }

	@Test
	public void getUserDetails() throws Exception {
		when(departmentService.getUserDetails()).thenReturn(new ArrayList<UserDetails>());
		mockMvc.perform(MockMvcRequestBuilders.get(GET_USER_DETAILS)
			    	.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

}
