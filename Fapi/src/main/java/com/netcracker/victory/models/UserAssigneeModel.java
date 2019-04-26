package com.netcracker.victory.models;

public class UserAssigneeModel {
    private int userId;
    private String name;
    private String surname;
    private String fullName;

    public UserAssigneeModel() {
    }

    public UserAssigneeModel(int userId, String name, String surname, String fullName) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.fullName = fullName;
    }

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
