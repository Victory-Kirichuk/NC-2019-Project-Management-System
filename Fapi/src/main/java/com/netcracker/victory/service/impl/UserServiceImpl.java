package com.netcracker.victory.service.impl;

//import com.netcracker.victory.backend.entities.UserEntity;
//import com.netcracker.victory.service.UserService;

//import org.springframework.beans.factory.annotation.Autowired;
import com.netcracker.victory.models.UserModel;
import com.netcracker.victory.service.UserService;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import org.springframework.web.client.RestTemplate;

//import java.util.*;

@Service("PUserDetailService")
public class UserServiceImpl implements  UserService {
    @Value("http://localhost:8084/")
    private String backendServerUrl;


    @Override
    public List<UserModel> getAll() {
        RestTemplate restTemplate=new RestTemplate();
        UserModel[] userModelResponse=restTemplate.getForObject(backendServerUrl+"/backend/api/user/", UserModel[].class);
        return userModelResponse==null? Collections.emptyList(): Arrays.asList(userModelResponse);
    }

    @Override
    public UserModel getUserByEmail(String email) {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(backendServerUrl+"/backend/api/user/"+email, UserModel.class);
    }

    @Override
    public UserModel getUserByUserId(int userId) {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(backendServerUrl+"/backend/api/user/"+userId, UserModel.class);
    }


    @Override
    public UserModel save(UserModel userModel) {
          RestTemplate restTemplate = new RestTemplate();

        return  restTemplate.postForEntity(backendServerUrl + "/backend/api/user/", userModel, UserModel.class).getBody();

    }
}
