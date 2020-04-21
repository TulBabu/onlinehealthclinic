/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.Dr_Madhusudan_Kayastha.controller;

import com.eclinic.web.Dr_Lokendra_Limbu.controller.*;
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
@RequestMapping(value = "/dr_madhusudan")
public class DrMadhusudanController extends CRUDController<DrJayant, Integer>{
    public DrMadhusudanController() {
        pageTitle="Dr Madhusudan Kayastha";
        pageURI="dr_madhusudan";
        viewPath="Dr_Madhusudan_Kayastha";
    }
    
}
