package com.mvc.demo.controller;

import com.mvc.demo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student/")
public class StudentController {

    //for external txt file lesson 132
    //@Value("#{countryOptions}")
    //private Map<String, String> countryOptions;


    @RequestMapping("show-form")
    public String showForm(Model theModel) {

        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);
        //for external txt file lesson 132
        //theModel.addAttribute("theCountryOptions", countryOptions);

        return "student-form";
    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}
