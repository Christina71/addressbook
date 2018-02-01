package com.example.addressbook;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
// List<Address>  findByName(String name);
    Iterable <Address> findAllByNameContainingIgnoreCase(String search);
}
