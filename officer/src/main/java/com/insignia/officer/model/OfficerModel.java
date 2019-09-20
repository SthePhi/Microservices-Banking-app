package com.insignia.officer.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "officer", catalog = "banking_app_db")
public class OfficerModel {
    private String userName;
    private String password;
    /*
    private String firstName;
    private String middleName;
    private String lastName;
    */
    private Date dateOfBirth;
    private String contact;
    private String gender;
    /*
    private String street;
    private String city;
    private String province;
    private String areaCode;
    */
    private Long salary;
    private String nationality;
    private String email;
    @Id
    @GeneratedValue
    private int employmentID;

    public OfficerModel() {

    }

    public OfficerModel(String userName, String password, /*String firstName, String middleName, String lastName,*/ Date dateOfBirth, String contact, String gender, /*String street, String city, String province, String areaCode,*/ Long salary, String nationality, String email) {
        this.userName = userName;
        this.password = password;
        /*
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        */
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
        this.gender = gender;
        /*
        this.street = street;
        this.city = city;
        this.province = province;
        this.areaCode = areaCode;
        */
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

    /*
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    */
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

    /*
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    */
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

    public int getEmploymentID() {
        return employmentID;
    }

    public void setEmploymentID(int employmentID) {
        this.employmentID = employmentID;
    }
}
