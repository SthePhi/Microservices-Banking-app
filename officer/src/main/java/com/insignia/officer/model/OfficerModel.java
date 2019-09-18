package com.insignia.officer.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "manager", catalog = "banking_app_db")
public class OfficerModel
{
    private String userName;
    private String password;
    private Name name;
    private Date dateOfBirth;
    private String contact;
    private String gender;
    private Address address;
    private Long salary;
    private String nationality;
    private String email;
    @Id
    @GeneratedValue
    private int employmentID;

    public OfficerModel()
    {

    }

    public OfficerModel(String userName, String password, Name name, Date dateOfBirth, String contact, String gender, Address address, Long salary, String nationality, String email) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
        this.gender = gender;
        this.address = address;
        this.salary = salary;
        this.nationality = nationality;
        this.email = email;
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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmplyomentID() {
        return employmentID;
    }

    public void setEmplymentID(int employmentID) {
        employmentID = employmentID;
    }
}
