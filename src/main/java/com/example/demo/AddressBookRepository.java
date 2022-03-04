package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface AddressBookRepository extends CrudRepository<AddressBook, Integer> {

    AddressBook findById(int id);
}
