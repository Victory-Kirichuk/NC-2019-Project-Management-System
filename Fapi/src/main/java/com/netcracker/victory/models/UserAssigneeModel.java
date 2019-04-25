package com.netcracker.victory.models;

public class UserAssigneeModel {
    private int userId;
    private String name;
    private String surname;
   private String fullName;

//    public UserModel(int userId, String name, String surname, Integer role, String email, String password) {
//        this.userId = userId;
//        this.name = name;
//        this.surname = surname;
//        this.role = role;
//        this.email = email;
//        this.password = password;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }




}
