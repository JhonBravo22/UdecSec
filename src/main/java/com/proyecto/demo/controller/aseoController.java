package com.proyecto.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.domain.aseoEntity;
import com.proyecto.demo.repositories.aseoRepositories;


@RestController
@RequestMapping("/api")
public class aseoController {

    private final aseoRepositories aseoRepo;

    @Autowired
    public aseoController(aseoRepositories aseoRepo) {
        this.aseoRepo = aseoRepo;
    }

    @GetMapping("/createAseo/{id}")
        public String createAseo(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Aseo creado satisfactoriamente "+id;
        }

    
    @GetMapping("/createAseo")
    public String createAseo (){
        return "aseo creado satisfactoriamente";
    }

    @GetMapping("/readAseo/{id}")
        public Optional<aseoEntity> readAseo(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return aseoRepo.findById(Long.valueOf(id));
        }

    @GetMapping("/readAseo")
    public String readAseo(){
        return "aseo encontrado satisfactoriamente";
    }

    @GetMapping("/updateAseo/{id}")
        public String updateAseo(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Aseo actualizado satisfactoriamente "+id;
        }

        @GetMapping("/updateAseo")
    public String updateAseo (){
        return "Aseo actualizado satisfactoriamente";
    }

    @GetMapping("/deleteAseo/{id}")
        public String deleteAseo(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Aseo eliminado satisfactoriamente "+id;
        }

    @GetMapping("/deleteAseo")
    public String deleteAseo(){
        return "Aseo eliminado satisfactoriamente";
    }

}
