package com.miguelmuniz.api.resource;

import com.miguelmuniz.api.entites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User("maraia",1L,"Maria@gmail.com","999999","1223444");
        return ResponseEntity.ok().body(u);
    }
}
