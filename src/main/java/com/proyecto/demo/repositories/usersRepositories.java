package com.proyecto.demo.repositories;

import com.proyecto.demo.domain.userEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface usersRepositories extends CrudRepository<userEntity, Long> {

    userEntity findByEmail(@Param(("email")) String email);
}
