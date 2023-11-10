package com.proyecto.demo.repositories;

import com.proyecto.demo.domain.ropaEntity;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface ropaRepositories extends CrudRepository<ropaEntity, Long>{
    
    Optional<ropaEntity> findById(Long id);
}
