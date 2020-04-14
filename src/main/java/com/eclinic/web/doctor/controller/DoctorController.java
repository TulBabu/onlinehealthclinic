/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.doctor.controller;

import com.eclinic.web.doctor.entity.Doctor;
import com.eclinic.core.controller.CRUDController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/doctors")
public class DoctorController extends CRUDController<Doctor, Integer>{
    public DoctorController() {
        pageTitle="home";
        pageURI="home";
        viewPath="home";
    }
    
}
