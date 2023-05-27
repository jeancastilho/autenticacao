package com.autenticacao.autenticacao.repository;

import java.util.ArrayList;
import java.util.List;

import com.autenticacao.autenticacao.entities.User;

public class UserRepository {

	private List<User> users;

	public UserRepository() {
		
		users = new ArrayList<>();
	}

	public void addUser(User user) {

		users.add(user);
	}

	public User getUserByUsuario(String email) {
		for (User user : users) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}
}
