package com.proyecto.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.domain.combosEntity;
import com.proyecto.demo.repositories.combosRepositories;


@RestController
@RequestMapping("/api")
public class combosController {
      private final combosRepositories comboRepo;

   @Autowired
    public combosController(combosRepositories comboRepo) {
        this.comboRepo = comboRepo;
    }

    @GetMapping("/createCombo/{id}")
        public String createCombos(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Combo creado satisfactoriamente "+id;
        }

    @GetMapping("/createCombo")
    public String createCombos (){
        return "Combo creada satisfactoriamente";
    }

    @GetMapping("/readCombo/{id}")
        public Optional<combosEntity> readCombos(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return comboRepo.findById(Long.valueOf(id));
        }

    @GetMapping("/readCombo")
    public String readCombos(){
        return "Combo encontrado satisfactoriamente";
    }

    @GetMapping("/updateCombo/{id}")
        public String updateCombos(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Combo actualizado satisfactoriamente "+id;
        }

        @GetMapping("/updateCombo")
    public String updateCombos (){
        return "Combo actualizado satisfactoriamente";
    }

    @GetMapping("/deleteCombo/{id}")
        public String deleteCombos(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Combo eliminado satisfactoriamente "+id;
        }

    @GetMapping("/deleteCombo")
    public String deleteCombos(){
        return "Combo eliminado satisfactoriamente";
    }
    
}
