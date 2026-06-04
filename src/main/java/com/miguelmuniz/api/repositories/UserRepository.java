package com.miguelmuniz.api.repositories;

import com.miguelmuniz.api.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
