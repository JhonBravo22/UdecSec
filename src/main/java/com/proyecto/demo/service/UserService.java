package com.proyecto.demo.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {
    ResponseEntity<String> SignUp(Map<String,String> requestMap);
}
