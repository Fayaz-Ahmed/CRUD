package com.nable.crud.controller;

import com.nable.crud.model.Student;
import com.nable.crud.repository.StudentRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getapi/nable/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/all")
    @ApiOperation("get all the students from system")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
