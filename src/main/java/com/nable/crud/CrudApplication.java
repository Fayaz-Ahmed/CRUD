package com.nable.crud;

import com.nable.crud.model.Student;
import com.nable.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student=new Student();
        student.setName("fayas");
        student.setEmailAddress("fayaz861818@gmail.com");
        studentRepository.save(student);

        Student student1=new Student();
        student1.setName("Perera");
        student1.setEmailAddress("perera@gmail.com");
        studentRepository.save(student1);
    }
}
