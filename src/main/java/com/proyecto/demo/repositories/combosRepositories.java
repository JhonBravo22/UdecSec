package com.proyecto.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.demo.domain.combosEntity;

public interface combosRepositories extends CrudRepository<combosEntity, Long> {

     Optional<combosEntity> findById(Long id);
    
}
