package com.dungnq.payroll.repositories;

import com.dungnq.payroll.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
