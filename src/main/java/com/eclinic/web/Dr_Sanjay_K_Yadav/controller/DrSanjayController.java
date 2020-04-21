/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.Dr_Sanjay_K_Yadav.controller;

import com.eclinic.web.Dr_Ritesh_Shrestha.controller.*;
import com.eclinic.web.dr_jayant.controller.*;
import com.eclinic.core.controller.CRUDController;
import com.eclinic.web.Dr_Sanjay_K_Yadav.entity.DrSanjay;
import com.eclinic.web.dr_jayant.entity.DrJayant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/dr_sanjay")
public class DrSanjayController extends CRUDController<DrSanjay, Integer>{
    public DrSanjayController() {
        pageTitle="Dr Sanjay K Yadav";
        pageURI="dr_sanjay";
        viewPath="Dr_Sanjay_K_Yadav";
    }
    
}
