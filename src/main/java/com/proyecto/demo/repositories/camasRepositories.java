package com.proyecto.demo.repositories;



import com.proyecto.demo.domain.camasEntity;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface camasRepositories extends CrudRepository<camasEntity, Long> {
    
    Optional<camasEntity> findById(Long id);
}
