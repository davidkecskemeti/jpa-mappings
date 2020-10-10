package com.dk.jpa.mappings.many2many.repository;

import com.dk.jpa.mappings.many2many.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByNameContaining(String name);
}
