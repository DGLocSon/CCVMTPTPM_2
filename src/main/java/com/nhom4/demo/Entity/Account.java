package com.nhom4.demo.Entity;

public class Account {
    public String username;
    public String password;
    public Role role;
    public Account() {
    }
    public Account(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}
