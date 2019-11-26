package com.dalircode.testdriven;

public class PermissionList {
    String permissionRead;
    String permissionWrite;
    String permissionDelete;

    public PermissionList(String permissionRead, String permissionWrite, String permissionDelete) {
        this.permissionRead = permissionRead;
        this.permissionWrite = permissionWrite;
        this.permissionDelete = permissionDelete;
    }

    public String getPermissionRead() {
        return permissionRead;
    }

    public String getPermissionWRite() {
        return permissionWrite;
    }

    public String getPermissionDelete() {
        return permissionDelete;
    }
}
