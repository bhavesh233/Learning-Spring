package com.json;

import com.POJO.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonDataRead {

    public static void main(String[] args) {

        ObjectMapper mapper  = new ObjectMapper();


//        try {
//            Student student = mapper.readValue(new File("data/sample-full.json"),Student.class);
//
//
//            System.out.println("First Name is :-  "+student.getFirstName());
//            System.out.println("First Name is :-  "+student.getLastName());
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

}
