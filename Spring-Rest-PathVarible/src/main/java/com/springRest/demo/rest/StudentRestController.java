package com.springRest.demo.rest;

import com.springRest.demo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<Student>();
        theStudents.add(new Student("Bhavesh", "Tukadiya"));
        theStudents.add(new Student("Harsh", "Sakariya"));
        theStudents.add(new Student("Parth", "Tank"));
    }


    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){


//        if( (studentId >= theStudents.size()) || (studentId < 0)){
//            throw new StudentNotFoundException("Student id not found "+studentId);
//        }
        return theStudents.get(studentId);
    }

    // add Exception



}
