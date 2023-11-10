package com.proyecto.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.domain.juguetesEntity;
import com.proyecto.demo.repositories.juguetesRepositories;

@RestController
@RequestMapping("/api")
public class juguetesController {

    private final juguetesRepositories juguetesRepo;

    @Autowired
    public juguetesController(juguetesRepositories juguetesRepo) {
        this.juguetesRepo = juguetesRepo;
    }

    @GetMapping("/createJuguetes/{id}")
        public String createJuguetes(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Juguetes creado satisfactoriamente "+id;
        }

    @GetMapping("/createJuguetes")
    public String createJuguetes (){
        return "Juguete creado satisfactoriamente";
    }

    @GetMapping("/readJuguetes/{id}")
        public Optional<juguetesEntity> readJuguetes(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return juguetesRepo.findById(Long.valueOf(id));
        }

    @GetMapping("/readJuguetes")
    public String readJuguetes(){
        return "Juguete encontrado satisfactoriamente";
    }

    @GetMapping("/updateJuguetes/{id}")
        public String updateJuguetes(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Juguetes creado satisfactoriamente "+id;
        }

        @GetMapping("/updateJuguetes")
    public String updateJuguetes (){
        return "Juguete actualizado satisfactoriamente";
    }

    @GetMapping("/deleteJuguetes/{id}")
        public String deleteJuguetes(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Juguetes eliminada satisfactoriamente "+id;
        }

    @GetMapping("/deleteJuguetes")
    public String deleteJuguetes(){
        return "Juguete eliminada satisfactoriamente";
    }

}
