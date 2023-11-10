package com.proyecto.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.domain.camasEntity;
import com.proyecto.demo.repositories.camasRepositories;

@RestController
@RequestMapping("/api")
public class camasController {

    private final camasRepositories camasRepo;
    
    @Autowired
    public camasController(camasRepositories camasRepo) {
        this.camasRepo = camasRepo;
    }

    @GetMapping("/createCamas/{id}")
        public String createCamas(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Cama creada satisfactoriamente "+id;
        }

    @GetMapping("/createCamas")
    public String createCamas (){
        return "Cama creada satisfactoriamente";
    }

    @GetMapping("/readCamas/{id}")
        public Optional<camasEntity> readCamas(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return camasRepo.findById(Long.valueOf(id));
    }

    @GetMapping("/readCamas")
    public String readCamas(){
        return "Cama encontrada satisfactoriamente";
    }

    @GetMapping("/updateCamas/{id}")
        public String updateCamas(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Cama actualizada satisfactoriamente "+id;
    }
        
        @GetMapping("/updateCamas")
    public String updateCamas (){
        return "Cama actualizada satisfactoriamente";
    }

    @GetMapping("/deleteCamas/{id}")
        public String deleteCamas(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Cama eliminada satisfactoriamente "+id;
    }

    @GetMapping("/deleteCamas")
    public String deleteCamas(){
        return "Cama eliminada satisfactoriamente";
    }

}
