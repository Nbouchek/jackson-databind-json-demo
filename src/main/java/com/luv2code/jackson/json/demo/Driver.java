package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file and map/convert to JAVA Pojo
            // data sample-lite.json
            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            // print first name and last name
            System.out.println("id = " + theStudent.getId());
            System.out.println("First name = " + theStudent.getFirstName());
            System.out.println("Last name = " + theStudent.getLastName());
            System.out.println("isActive = " + theStudent.isActive());
            System.out.println("Address: \n" + theStudent.getAddress());
            System.out.println("Languages:");
            for (String language : theStudent.getLanguages()) {
                System.out.println("\t" + language);
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
