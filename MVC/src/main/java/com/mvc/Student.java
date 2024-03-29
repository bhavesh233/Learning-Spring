package com.mvc;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String,String> countryOptions;
    private String favoriteLanguage;
    private List<String> operatingSystems;

    public Student() {

        //  populate country options: used ISO code here
        countryOptions = new LinkedHashMap<String, String>();
        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","France");
        countryOptions.put("DE","Germany");
        countryOptions.put("IN","India");
    }

    public List<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(List<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
