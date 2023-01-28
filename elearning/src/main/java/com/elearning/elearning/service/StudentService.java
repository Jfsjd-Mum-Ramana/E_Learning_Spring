package com.elearning.elearning.service;

import com.elearning.elearning.model.students;

public interface StudentService {
    public String createStudent(students student);
    public students getStudentById(Integer id);
    public Iterable<students> getAllStudents();
    public students updateStudentById(Integer id, students student);
    public students deleteStudentById(Integer id);



}
