package com.proyecto.demo.repositories;

import com.proyecto.demo.domain.aseoEntity;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface aseoRepositories extends CrudRepository<aseoEntity, Long> {

    Optional<aseoEntity> findById(Long id);
    
}
