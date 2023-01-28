package com.elearning.elearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.elearning.model.students;
import com.elearning.elearning.service.StudentService;

@RestController
public class studentcontroller {

    @Autowired
    private StudentService studentservice;
    @CrossOrigin
    @PostMapping("/students")
    public ResponseEntity<String> createStudent(@RequestBody students student) {
        String status = studentservice.createStudent(student);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/students/{id}")

    public ResponseEntity<students> getStudentById(@PathVariable Integer id) {
        students status = studentservice.getStudentById(id);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @CrossOrigin
    @GetMapping("/students")
    public ResponseEntity<Iterable<students>> getAllStudents() {
        Iterable<students> status = studentservice.getAllStudents();
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<students> updateStudent(@PathVariable Integer id, @RequestBody students students) {
        students status = studentservice.updateStudentById(id, students);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<students> deleteStudentById(@PathVariable Integer id) {
        students status = studentservice.deleteStudentById(id);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
}
