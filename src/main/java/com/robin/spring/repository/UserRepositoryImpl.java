package com.robin.spring.repository;

import org.springframework.stereotype.Repository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

    public UserRepositoryImpl() {
        System.out.println("UserRepositoryImpl construct...");
    }

    public void say() {
        System.out.println("UserRepository Save...");
    }
}
