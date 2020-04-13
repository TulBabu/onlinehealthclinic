/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eclinic.core.controller;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Babu TUl
 */
public abstract class CRUDController<T, Id> extends
        SiteController{
    @Autowired
    protected JpaRepository<T,Id> repository;
    @GetMapping()
    public String index(Model model){
            model.addAttribute("records",
                    repository.findAll());
        return viewPath +"/index";
        
    }
    @GetMapping(value = "/create")
    public String create(Model model){
        return viewPath +"/create";
    }
    @GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable("id")Id id,Model model){
        model.addAttribute("record",
                repository.findById(id).get());
        return viewPath +"/edit";
    }
    @PostMapping
    @Transactional
    public String save(T entity){
        repository.save(entity);
        return"redirect:/" + pageURI +"?success";
    }
    @PostMapping(value="/json")
    @Transactional
    @ResponseBody
    public String saveJson(T entity){
        repository.save(entity);
        return "success";
    }
    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id")Id id){
        repository.deleteById(id);
        return"redirect:/" + pageURI +"?success";
    }
    @GetMapping(value = "/json")
    @ResponseBody
    public List<T> json(){
        return repository.findAll();
    }
    @GetMapping(value = "/json/{id}")
    @ResponseBody
    public T jsonDetail(@PathVariable("id")Id id){
        return repository.findById(id).get();
    }
     @GetMapping(value = "/table")
    public String table(Model model){
            model.addAttribute("records",
                    repository.findAll());
        return viewPath +"/table";
        
    }
}
