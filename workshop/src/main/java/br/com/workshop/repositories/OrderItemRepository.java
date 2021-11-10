package br.com.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}