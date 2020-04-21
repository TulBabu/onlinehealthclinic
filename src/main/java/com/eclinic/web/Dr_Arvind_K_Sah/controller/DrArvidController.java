/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.Dr_Arvind_K_Sah.controller;

import com.eclinic.web.dr_jayant.controller.*;
import com.eclinic.core.controller.CRUDController;
import com.eclinic.web.Dr_Arvind_K_Sah.entity.DrArvind;
import com.eclinic.web.dr_jayant.entity.DrJayant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Babu TUl
 */
@Controller
@RequestMapping(value = "/dr_arvind")
public class DrArvidController extends CRUDController<DrArvind, Integer>{
    public DrArvidController() {
        pageTitle="Dr.Arvind K Sah";
        pageURI="dr_arvind";
        viewPath="Dr_Arvind_K_Sah";
    }
    
}
