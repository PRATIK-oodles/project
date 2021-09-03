package com.example.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Teacher;
import com.example.crud.repository.TeachersRepository;
@Service
public class TeacherService {
	@Autowired
	TeachersRepository teachersRepository;

	  // getting all students record by using the method findaAll() of CrudRepository
	  public List<Teacher> getAllTeacher() {
	    List<Teacher> teacher = new ArrayList<Teacher>();
	    teachersRepository.findAll().forEach(e -> teacher.add(e));
	    return teacher;
	  }

	  // getting a specific record by using the method findById() of CrudRepository
	  public Teacher getTeacherById(int id) {
	    return teachersRepository.findById(id).get();
	  }

	  // saving a specific record by using the method save() of CrudRepository
	  public void saveOrUpdate(Teacher teacher) {
		  teachersRepository.save(teacher);
	  }

	  // deleting a specific record by using the method deleteById() of CrudRepository
	  public void delete(int id) {
		  teachersRepository.deleteById(id);
	  }

	  // updating a record
	  public void update(Teacher teacher, int teacherid) {
		  teachersRepository.save(teacher);
	  }
	}



