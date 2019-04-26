package com.netcracker.victory.models;

import java.util.List;

public class RoleModel {
    private int roleId;
    private String role;

    public RoleModel() {
    }

    public RoleModel(int roleId, String role) {
        this.roleId = roleId;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
