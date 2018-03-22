package com.example.controller;

import com.example.entity.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class GymControl {
    @Autowired
    PersonService service;

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    //@ResponseBody
    public List<Person> getAllPersons(){
        List<Person> all = service.getAll();
        return all;
    }

    @RequestMapping(value = "/persons/{id}", method = RequestMethod.GET)
    //@ResponseBody
    public Person getPerson(@PathVariable("id") long personID){
       return service.getById(personID);

    }
    @RequestMapping(value = "/persons", method = RequestMethod.POST)
    //@ResponseBody
    public Person savePerson(@RequestBody Person person){
        return service.save(person);

    }
    @RequestMapping(value = "/persons/{id}", method = RequestMethod.DELETE)
    //@ResponseBody
    public void deletePerson(@PathVariable("id") long personID){
         service.remove(personID);

    }

}
