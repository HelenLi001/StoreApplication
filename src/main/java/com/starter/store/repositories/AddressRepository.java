package com.starter.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.starter.store.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
    
}
