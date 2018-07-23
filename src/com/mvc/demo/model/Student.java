package com.mvc.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;

@Getter
@Setter
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favouriteLanguage;
    private LinkedHashMap<String, String> favouriteLanguageOptions;

    public Student(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("PL", "Poland");
        countryOptions.put("IN", "India");


    }
}
