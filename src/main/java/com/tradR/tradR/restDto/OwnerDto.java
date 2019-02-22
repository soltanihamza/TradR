package com.tradR.tradR.restDto;

import com.tradR.tradR.models.Item;

import java.util.HashSet;
import java.util.Set;

public class OwnerDto {

    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private long phone;
    private String adress;

    public OwnerDto() {
    }

    public OwnerDto(String firstName, String lastName, String mail, String password, long phone, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.adress = adress;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
