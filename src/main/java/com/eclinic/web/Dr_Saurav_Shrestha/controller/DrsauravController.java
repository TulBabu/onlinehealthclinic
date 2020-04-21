/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.Dr_Saurav_Shrestha.controller;

import com.eclinic.web.dr_jayant.controller.*;
import com.eclinic.core.controller.CRUDController;
import com.eclinic.web.dr_jayant.entity.DrJayant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/dr_saurav")
public class DrsauravController extends CRUDController<DrJayant, Integer>{
    public DrsauravController() {
        pageTitle="Dr.Saurav Shrestha";
        pageURI="dr_saurav";
        viewPath="Dr_Saurav_Shrestha";
    }
    
}
