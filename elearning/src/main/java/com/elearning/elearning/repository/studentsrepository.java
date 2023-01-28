package com.elearning.elearning.repository;

import org.springframework.data.repository.CrudRepository;

import com.elearning.elearning.model.students;


public interface studentsrepository extends CrudRepository<students, Integer>{ 
    
}