package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Teacher;
import com.example.crud.service.TeacherService;

@RestController
public class TeacherController {
	// autowire the TeacherServices class
	@Autowired
	TeacherService teacherServices;

	// creating a get mapping that retrieves all the teachers detail from the
	// database
	@GetMapping("/teacher")
	private List<Teacher> getAllteachers() {
		return teacherServices.getAllTeacher();
	}

	// creating a get mapping that retrieves the detail of a specific student
	@GetMapping("/teacher/{teacherid}")
	private Teacher getstudents(@PathVariable("teacherid") int teacherid) {
		return teacherServices.getTeacherById(teacherid);
	}

	// creating a delete mapping that deletes a specified teacher
	@DeleteMapping("/teacher/{teacherid}")
	private void deletestudent(@PathVariable("teacherid") int teacherid) {
		teacherServices.delete(teacherid);
	}

	// creating post mapping that post the student detail in the database
	@PostMapping("/teacher")
	private int savestudent(@RequestBody Teacher teacher) {
		teacherServices.saveOrUpdate(teacher);
		return teacher.getTeacherid();
	}

	// creating put mapping that updates the student detail
	@PutMapping("/teacher")
	private Teacher update(@RequestBody Teacher teacher) {
		teacherServices.saveOrUpdate(teacher);
		return teacher;
	}
}
