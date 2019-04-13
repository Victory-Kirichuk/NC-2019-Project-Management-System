package com.netcracker.victory.models;

public class LoginUser {
    private String email;
    private String password;
     public LoginUser(){}
     public LoginUser (String email,String password){this.email=email;
     this.password=password;}
    public String getEmail() {
        return email;
    }

    public void setEmail(String username) {
        this.email=email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
