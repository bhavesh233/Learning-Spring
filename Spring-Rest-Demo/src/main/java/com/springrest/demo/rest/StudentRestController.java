package com.springrest.demo.rest;

import com.springrest.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudent = new ArrayList<>();

        theStudent.add(new Student("Bhavesh", "Tukadiya"));
        theStudent.add(new Student("Harsh", "Sakariya"));
        theStudent.add(new Student("Parth", "Tank"));

        return theStudent;

    }

}
