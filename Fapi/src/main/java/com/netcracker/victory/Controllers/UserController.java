package com.netcracker.victory.Controllers;


import com.netcracker.victory.models.UserModel;
import com.netcracker.victory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import org.springframework.security.access.prepost.PreAuthorize;

@RestController("UController")
@RequestMapping("/user")
public class UserController {

@Autowired
    private UserService userService;
@GetMapping
@RequestMapping(value = "",method = RequestMethod.GET)
public ResponseEntity<List<UserModel>> getUsers(){

    return ResponseEntity.ok(userService.getAll());


}
@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public ResponseEntity<UserModel> getUserByUserId(@PathVariable(name = "userId")int userId)
    {UserModel userModel=userService.getUserByUserId(userId);
        return ResponseEntity.ok(userModel);
    }

    @RequestMapping(value = "/login/{email}", method = RequestMethod.GET)
    public ResponseEntity<UserModel> getUserByEmail(@PathVariable(name = "email")String email)
    {UserModel userModel=userService.getUserByEmail(email);
        return ResponseEntity.ok(userModel);
    }



    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserModel> save(@RequestBody UserModel userModel ) {

            return ResponseEntity.ok(userService.save(userModel));

    }

}


