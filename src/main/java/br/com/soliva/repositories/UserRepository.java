package br.com.soliva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soliva.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
