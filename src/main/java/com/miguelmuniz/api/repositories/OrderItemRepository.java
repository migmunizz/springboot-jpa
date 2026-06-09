package com.miguelmuniz.api.repositories;

import com.miguelmuniz.api.entites.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
