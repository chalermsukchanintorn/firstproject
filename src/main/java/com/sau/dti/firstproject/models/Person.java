package com.sau.dti.firstproject.models;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    // ไม่ต้องเก็บอายุใน model นี้โดยตรง — จะคำนวณภายหลัง

    // Getters & Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
}
