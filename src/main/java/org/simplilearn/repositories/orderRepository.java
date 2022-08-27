package org.simplilearn.repositories;

import org.simplilearn.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderRepository extends JpaRepository<Order, Integer> {

}
