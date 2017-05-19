package com.example.domain;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by lucaschen on 18/05/2017.
 */
public class Employee {

    private long id;

    @Size(min = 1, max = 10)
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int salaryLevel;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(int salaryLevel) {
        this.salaryLevel = salaryLevel;
    }
}
