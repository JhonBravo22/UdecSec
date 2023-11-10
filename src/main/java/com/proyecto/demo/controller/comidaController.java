package com.proyecto.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.domain.comidaEntity;
import com.proyecto.demo.repositories.comidaRepositories;

@RestController
@RequestMapping("/api")
public class comidaController {

    private final comidaRepositories comidaRepo;

   @Autowired
    public comidaController(comidaRepositories comidaRepo) {
        this.comidaRepo = comidaRepo;
    }

    @GetMapping("/createComida/{id}")
        public String createComida(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Comida creada satisfactoriamente "+id;
        }

    @GetMapping("/createComida")
    public String createComida (){
        return "Comida creada satisfactoriamente";
    }

    @GetMapping("/readComida/{id}")
        public Optional<comidaEntity> readComida(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return comidaRepo.findById(Long.valueOf(id));
        }

    @GetMapping("/readComida")
    public String readComida(){
        return "Comida encontrada satisfactoriamente";
    }

    @GetMapping("/updateComida/{id}")
        public String updateComida(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Comida actualizada satisfactoriamente "+id;
        }

        @GetMapping("/updateComida")
    public String updateComida (){
        return "Comida actualizada satisfactoriamente";
    }

    @GetMapping("/deleteComida/{id}")
        public String deleteComida(@PathVariable("id") String id){
        String regexforID = "[A-Z 0-9 a-z]{0,15}";
            if (id == null || !id.matches(regexforID))
            throw new IllegalArgumentException();
         return "Comida eliminada satisfactoriamente "+id;
        }

    @GetMapping("/deleteComida")
    public String deleteComida(){
        return "Comida eliminada satisfactoriamente";
    }

}
