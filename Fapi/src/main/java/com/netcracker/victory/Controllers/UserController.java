package com.netcracker.victory.Controllers;


import com.netcracker.victory.backend.entities.UserEntity;
import com.netcracker.victory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/api/user")
public class UserController {

@Autowired
    private UserService userService;
@PreAuthorize("hashRole('ADMIN')")
    @GetMapping
    public List<UserEntity> getAllUserEntities(){return userService.findAll();}
    @GetMapping("/login/{email}")
    public UserEntity getUserEntityByEmail(@PathVariable String email){return userService.findUserEntitiesByEmail(email);}
    @RequestMapping(value = "/signup", method = RequestMethod.POST,produces = "application/json")
    public UserEntity saveUser(@RequestBody UserEntity userEntity)
    {
        return userService.save(userEntity);
    }
}


