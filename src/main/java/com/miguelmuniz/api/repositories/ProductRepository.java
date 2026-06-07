package com.miguelmuniz.api.repositories;


import com.miguelmuniz.api.entites.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
