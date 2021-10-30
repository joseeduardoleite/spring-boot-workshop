package br.com.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}