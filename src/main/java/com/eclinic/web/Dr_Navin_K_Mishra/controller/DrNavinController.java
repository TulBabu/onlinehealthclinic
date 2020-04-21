/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.Dr_Navin_K_Mishra.controller;

import com.eclinic.web.Dr_Prakash_dware.controller.*;
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
@RequestMapping(value = "/dr_navin")
public class DrNavinController extends CRUDController<DrJayant, Integer>{
    public DrNavinController() {
        pageTitle="Dr.Navin K Mishra";
        pageURI="dr_navin";
        viewPath="Dr_Navin_K_Mishra";
    }
    
}
