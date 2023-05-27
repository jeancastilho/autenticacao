package com.autenticacao.autenticacao.repository;

import com.autenticacao.autenticacao.entities.User;

public class AuthenticationManager {

	private UserRepository userRepository;
	
	public AuthenticationManager(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public boolean login(String email, String senha) {
		
		User user = userRepository.getUserByUsuario(email);
		
		
		if(user !=null && user.getSenha().equals(email)) {
			return true;
		}
		
		return false;
	}
}
