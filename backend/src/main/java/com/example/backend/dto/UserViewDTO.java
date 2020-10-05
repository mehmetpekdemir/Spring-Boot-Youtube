package com.example.backend.dto;

import java.io.Serializable;

import com.example.backend.model.User;

import lombok.Getter;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Getter
public final class UserViewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String firstName;

	private final String lastName;

	private UserViewDTO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static UserViewDTO of(User user) {
		return new UserViewDTO(user.getFirstName(), user.getLastName());
	}

}
