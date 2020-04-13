/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.web.doctor.repository;

import com.eclinic.web.doctor.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Babu TUl
 */
@Repository
public interface DoctorRepository extends
        JpaRepository<Doctor, Integer>{
    
}
