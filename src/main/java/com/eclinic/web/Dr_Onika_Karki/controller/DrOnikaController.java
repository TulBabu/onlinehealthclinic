/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.Dr_Onika_Karki.controller;

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
@RequestMapping(value = "/dr_onika")
public class DrOnikaController extends CRUDController<DrJayant, Integer>{
    public DrOnikaController() {
        pageTitle="Dr.Onika Karki";
        pageURI="dr_onika";
        viewPath="Dr_Onika_Karki";
    }
    
}
