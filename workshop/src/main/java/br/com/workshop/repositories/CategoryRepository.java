package br.com.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}