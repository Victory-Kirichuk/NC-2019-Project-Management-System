package com.netcracker.victory.service;

//import com.netcracker.victory.backend.entities.UserEntity;

import com.netcracker.victory.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService  {
    List<UserModel> getAll();
    UserModel getUserByEmail(String email);
    UserModel getUserByUserId(int userId);

UserModel save(UserModel userModel);



}
