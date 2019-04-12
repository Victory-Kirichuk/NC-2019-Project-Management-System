package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.UserEntity;
import com.netcracker.victory.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/api/user")
public class UserController {

@Autowired
  public UserService userService;

    @RequestMapping (value = "/login/{email}",method = RequestMethod.GET)
    public ResponseEntity<UserEntity> getUserByEmail(@PathVariable(name ="email")String email)
    {UserEntity userEntity=userService.findUserEntitiesByEmail(email);
    return  ResponseEntity.ok(userEntity);}



    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<UserEntity> getAllUserEntities() {
        return userService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public UserEntity saveUser(@RequestBody UserEntity userEntity) {return  userService.save(userEntity);}


}
