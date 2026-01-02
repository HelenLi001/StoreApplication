package com.starter.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.starter.store.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
