/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.Dr_Sanjay_K_Yadav.repository;

import com.eclinic.web.Dr_Ritesh_Shrestha.repository.*;
import com.eclinic.web.Dr_Ritesh_Shrestha.entity.DrRitesh;
import com.eclinic.web.Dr_Sanjay_K_Yadav.entity.DrSanjay;
import com.eclinic.web.dr_jayant.repository.*;
import com.eclinic.web.dr_jayant.entity.DrJayant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Babu TUl
 */
@Repository
public interface DrSanjayRepository extends
        JpaRepository<DrSanjay, Integer>{
    
}
