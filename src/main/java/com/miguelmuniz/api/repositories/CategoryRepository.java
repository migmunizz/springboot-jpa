package com.miguelmuniz.api.repositories;


import com.miguelmuniz.api.entites.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
