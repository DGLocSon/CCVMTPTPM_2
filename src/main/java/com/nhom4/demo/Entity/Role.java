package com.nhom4.demo.Entity;

public class Role {
    public String id;
    public String name;
    public String stringPermission;
    public Role() {
    }
    public Role(String id, String name, String stringPermission) {
        this.id = id;
        this.name = name;
        this.stringPermission = stringPermission;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStringPermission() {
        return stringPermission;
    }
    public void setStringPermission(String stringPermission) {
        this.stringPermission = stringPermission;
    }
}
