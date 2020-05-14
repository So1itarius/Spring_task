package ru.pavellarionov93.springwebtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pavellarionov93.springwebtask.entity.Order;

public interface OrdersRepository extends JpaRepository<Order, Long> {
}
