package br.com.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}