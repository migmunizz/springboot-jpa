package com.miguelmuniz.api.config;

import com.miguelmuniz.api.repositories.UserRepository;
import com.miguelmuniz.api.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria","Maria@gmail.com","1199200002","122244423");
        User u2 = new User(null,"Bob","Bob@gmail.com","119924442","1222433223");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
