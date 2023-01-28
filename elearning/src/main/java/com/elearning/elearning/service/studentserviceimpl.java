package com.elearning.elearning.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.elearning.model.students;
import com.elearning.elearning.repository.studentsrepository;
@Service
public class studentserviceimpl implements StudentService{
    @Autowired
    private studentsrepository studentrepository;

    public String createStudent(students student){
        studentrepository.save(student);
        return "success";
    }
    public students getStudentById(Integer id){
        Optional<students> findById=studentrepository.findById(id);
        if(findById.isPresent()){
            return findById.get();
        }
    
        return null;
    }
    public Iterable<students> getAllStudents(){
        return studentrepository.findAll();
        
    }
    public students updateStudentById(Integer id, students student){
        Optional<students> studentToUpdateOptional=studentrepository.findById(id);
        if (!studentToUpdateOptional.isPresent()) {
            return null;
          }
         
          
          students studentToUpdate = studentToUpdateOptional.get();
          if (student.getCourse() != null) {
            studentToUpdate.setCourse(student.getCourse());
          }
          if (student.getDegree() != null) {
            studentToUpdate.setDegree(student.getDegree());
          }
          
          if (student.getEmail() != null) {
            studentToUpdate.setEmail(student.getEmail());
          }
         
          
          if (student.getGraduation_year() != null) {
            studentToUpdate.setGraduation_year(student.getGraduation_year());
          }
          if (student.getMobile() != null) {
            studentToUpdate.setMobile(student.getMobile());
          }
          if (student.getName() != null) {
            studentToUpdate.setName(student.getName());
          }
          students updatedsStudents = studentrepository.save(studentToUpdate);
          return updatedsStudents;
        }
        public students deleteStudentById(Integer id) {
            Optional<students> studentsToDeleteOptional = studentrepository.findById(id);
            if (!studentsToDeleteOptional.isPresent()) {
              return null;
            }
            students studentToDelete = studentsToDeleteOptional.get();
            studentrepository.delete(studentToDelete);
            return studentToDelete;
          }
       
       


    
}