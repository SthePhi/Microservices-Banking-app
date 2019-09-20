package com.insignia.manager.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "manager", catalog = "banking_app")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeID;
    private String userName;
    private String password;
    private String email;
    private String contact;
    private Date dateOfBirth;
    private String gender;
    private String nationality;
    private Double salary;
    @OneToOne(cascade = CascadeType.ALL)
    private Name name;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Manager() {
    }

    public Manager(String userName, String password, String email, String contact
            , Date dateOfBirth, String gender, String nationality, Double salary
            , Name name, Address address) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.salary = salary;
        this.name = name;
        this.address = address;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
