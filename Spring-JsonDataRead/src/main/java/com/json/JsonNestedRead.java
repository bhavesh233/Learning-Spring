package com.json;

import com.POJO.Address;
import com.POJO.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonNestedRead {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Student student  = objectMapper.readValue(new File("data/sample-full.json"),Student.class);

            System.out.println("First name is "+student.getFirstName());
            System.out.println("Last name is "+student.getLastName());
            System.out.println("ID is "+student.getId());

            Address address = student.getAddress();

            System.out.println(address.getState());
            System.out.println(address.getCountry());



            for(String tempLang:student.getLanguages()){
                System.out.print("  "+tempLang);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
