package com.example.repository;

import com.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
