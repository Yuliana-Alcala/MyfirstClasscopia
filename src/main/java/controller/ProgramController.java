package controller;

import models.Person;

public class ProgramController {


    public String getPersonAttributes(Person person1) {
        
        String atributes =  "Name: " + person1.getName() + "\n" +
               "Last Name: " + person1.getLastName() + "\n" +
               "DNI: " + person1.getDni() + "\n" +
               "Year Of Birth: " + person1.getYearOfBirth() + "\n" +
               "Country: " + person1.getCountryOfBirth() + "\n" +
               "Gender: " + person1.getGender();
        return atributes;
    }

}
