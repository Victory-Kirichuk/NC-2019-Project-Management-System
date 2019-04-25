package com.netcracker.victory.Controllers;


import com.netcracker.victory.models.UserAssigneeModel;
import com.netcracker.victory.models.UserModel;
import com.netcracker.victory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("UController")
@RequestMapping("/user")
public class UserController {

@Autowired
    private UserService userService;
@GetMapping
@RequestMapping
public ResponseEntity<List<UserModel>> getStatuses(){

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



}


