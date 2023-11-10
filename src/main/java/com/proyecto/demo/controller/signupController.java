package com.proyecto.demo.controller;

import com.proyecto.demo.constants.loginCodes;
import com.proyecto.demo.constants.loginUtils;
import com.proyecto.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyecto.demo.repositories.usersRepositories;

import java.util.Map;

/**
 * @author AndresMiranda
 */
@RestController
@RequestMapping("/v1")
public class signupController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<String> registroUsuario(@RequestBody(required = true)Map<String,String> requestMap){
        try{
            userService.SignUp(requestMap);
            return loginUtils.getResponseEntity(loginCodes.SUCCESS, HttpStatus.CREATED);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return loginUtils.getResponseEntity(loginCodes.SOMETHING_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
