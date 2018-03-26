package com.example.service;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;
   public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Page<Person> findPaginated(int page, int size){
        return  personRepository.findAll(new PageRequest(page,size, Sort.unsorted()));
    }

    public Person getById(long personID) {
        return personRepository.findById(personID).get();


    }

    public Person save(Person person) {
        return personRepository.saveAndFlush(person);
    }

    public void remove(long personID) {
         personRepository.deleteById(personID);
    }
}
