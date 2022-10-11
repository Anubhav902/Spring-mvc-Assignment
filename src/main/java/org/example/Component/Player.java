package org.example.Component;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Player {

    private String name;
    private String country;
    private int designation;
    private Date dob;
    private String email;

    public Player() {
    }

    public Player(String name, String country, int designation, Date dob, String email) {
        this.name = name;
        this.country = country;
        this.designation = designation;
        this.dob = dob;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", designation=" + designation +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
