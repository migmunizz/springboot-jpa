package com.miguelmuniz.api.repositories;


import com.miguelmuniz.api.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}