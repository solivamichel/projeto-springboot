package br.com.soliva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.soliva.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
