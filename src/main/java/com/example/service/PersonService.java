package com.example.service;

import com.example.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonService {
    List<Person> getAll();
    Page<Person> findPaginated(int page, int size);
    Person getById(long personID);
    Person save(Person person);
    void remove(long personID);
}
