package com.proyecto.demo.repositories;

import com.proyecto.demo.domain.comidaEntity;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface comidaRepositories extends CrudRepository<comidaEntity, Long>{
    
    Optional<comidaEntity> findById(Long id);
}
