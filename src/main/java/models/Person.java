package models;

public class Person {
    private String name;
    private String lastName;
    private String dni;
    private int yearOfBirth;
    private String countryOfBirth;
    private char gender;
    
    public Person(String name, String lastName, String dni, int yearOfBirth, String countryOfBirth, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
