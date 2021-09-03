package com.many2many.domains;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String abbreviation;
    private int modules;
    private double fee;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private Set<Student> students = new HashSet<>();

    public Course() {
    }

    public Course(String title, String abbreviation, int modules, double fee) {
        this.title = title;
        this.abbreviation = abbreviation;
        this.modules = modules;
        this.fee = fee;
    }

 // getters and setters, equals(), toString()
}
