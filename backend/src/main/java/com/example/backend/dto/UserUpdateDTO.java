package com.example.backend.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Data
public class UserUpdateDTO {

	@NotNull(message = "{backend.constraints.firstname.NotNull.message}")
	@Size(min = 2, max = 32, message = "{backend.constraints.firstname.Size.message}")
	private String firstName;

	@NotNull(message = "{backend.constraints.lastname.NotNull.message}")
	@Size(min = 3, max = 32, message = "{backend.constraints.lastname.Size.message}")
	private String lastName;

}
