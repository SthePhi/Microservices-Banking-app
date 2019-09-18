package com.insignia.officer.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "manager", catalog = "banking_app_db")
public class Address
{
    private String street;
    private String city;
    private String province;
    private String areaCode;

    public Address()
    {

    }

    public Address(String street, String city, String province, String areaCode)
    {
        this.street = street;
        this.city = city;
        this.province = province;
        this.areaCode = areaCode;
    }

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
}
