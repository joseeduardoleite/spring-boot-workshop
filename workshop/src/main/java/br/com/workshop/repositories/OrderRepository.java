package br.com.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}