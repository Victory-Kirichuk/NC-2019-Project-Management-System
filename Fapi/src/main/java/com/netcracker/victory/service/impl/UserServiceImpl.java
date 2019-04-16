package com.netcracker.victory.service.impl;

//import com.netcracker.victory.backend.entities.UserEntity;
//import com.netcracker.victory.service.UserService;

//import org.springframework.beans.factory.annotation.Autowired;
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

import java.util.List;
//import org.springframework.web.client.RestTemplate;

//import java.util.*;

@Service("PUserDetailService")
public class UserServiceImpl implements  UserService {
    @Value("http://localhost:8083/")
    private String backendServerUrl;



//    @Override
//    public List<UserEntity> findAll() {
//        RestTemplate restTemplate = new RestTemplate();
////        UserEntity[] usersResponse = restTemplate.getForObject(backendServerUrl + "backend/api/user", UserEntity[].class);
//        return null;//usersResponse == null ? Collections.emptyList() : Arrays.asList(usersResponse);
//
//    }
//
//    @Override
//    public UserEntity findUserEntitiesByEmail(String email) {
//        RestTemplate restTemplate=new RestTemplate();
////        UserEntity userEntity=restTemplate.getForObject(backendServerUrl+"/api/user/login"+email, UserEntity.class);
//    return null;//userEntity;
//    }
//
//    @Override
//    public UserEntity save(UserEntity userEntity) {
//        return null;
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
////       UserEntity userEntity=findUserEntitiesByEmail(email);
////       if(userEntity==null){
////           throw new UsernameNotFoundException("Error.Check your authorization data and try again");
////       }
//        return null;//new org.springframework.security.core.userdetails.User(userEntity.getEmail(),userEntity.getPassword(),getAuthority(userEntity));
//    }
//    private Set<SimpleGrantedAuthority> getAuthority(UserEntity userEntity) {
//        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
//        authorities.add(new SimpleGrantedAuthority("ROLE_" + userEntity.getRole()));
//        return authorities;
//    }

}
