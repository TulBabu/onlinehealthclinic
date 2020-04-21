/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.Dr_Jiuneshwar_Lal_Jha.entity;

import com.eclinic.web.dr_jayant.entity.*;
import com.eclinic.core.entity.MasterEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Babu TUl
 */
@Entity
@Table(name = "tbl_drjayant")
public class DrJiuneshwar extends MasterEntity{
    @Column(name="name")
    private String name;
    @Column(name="contact_no")
    private String contactNo;
    @Column(name="address")
    private String address;
    @Column(name="message")
    private String message;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
