package com.proyecto.demo.repositories;

import com.proyecto.demo.domain.juguetesEntity;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface juguetesRepositories extends CrudRepository<juguetesEntity, Long>{
    
    Optional<juguetesEntity> findById(Long id);
}
