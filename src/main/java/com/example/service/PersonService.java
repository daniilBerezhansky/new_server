package com.example.service;

import com.example.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAll();
    Person getById(long personID);
    Person save(Person person);
    void remove(long personID);
}
