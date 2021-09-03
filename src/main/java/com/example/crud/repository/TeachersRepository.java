package com.example.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.crud.model.Teacher;

public interface TeachersRepository extends CrudRepository<Teacher, Integer> {
	
}


