package com.elearning.elearning.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "students")

public class students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Course")
    private String course;
    @Column(name = "Degree")
    private String degree;
    @Column(name = "Email")
    private String email;
    @Column(name = "Graduation_Year")
    private Integer graduation_year;
    @Column(name = "Mobile")
    private Long mobile;
    @Column(name = "Name")
    private String name;
    
    
    

}