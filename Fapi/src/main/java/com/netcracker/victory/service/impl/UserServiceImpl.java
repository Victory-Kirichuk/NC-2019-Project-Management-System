package com.netcracker.victory.service.impl;

import com.netcracker.victory.backend.entities.UserEntity;
import com.netcracker.victory.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service("PUserDetailService")
public class UserServiceImpl implements UserDetailsService, UserService {
    @Value("http://localhost:8083/")
    private String backendServerUrl;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public List<UserEntity> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        UserEntity[] usersResponse = restTemplate.getForObject(backendServerUrl + "/api/user", UserEntity[].class);
        return usersResponse == null ? Collections.emptyList() : Arrays.asList(usersResponse);

    }

    @Override
    public UserEntity findUserEntitiesByEmail(String email) {
        RestTemplate restTemplate=new RestTemplate();
        UserEntity userEntity=restTemplate.getForObject(backendServerUrl+"/api/user/login"+email, UserEntity.class);
    return userEntity;
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        userEntity.setPassword(bCryptPasswordEncoder.encode(userEntity.getPassword()));
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/user", userEntity, UserEntity.class).getBody();

    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       UserEntity userEntity=findUserEntitiesByEmail(email);
       if(userEntity==null){
           throw new UsernameNotFoundException("Error.Check you email and password and try again");
       }
        return new org.springframework.security.core.userdetails.User(userEntity.getEmail(),userEntity.getPassword(),getAuthority(userEntity));
    }
    private Set<SimpleGrantedAuthority> getAuthority(UserEntity userEntity) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + userEntity.getRole()));
        return authorities;
    }

}
