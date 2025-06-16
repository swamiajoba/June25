package com.bean;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginUser {

    @NotBlank(message = "User name can not be empty")
    @Size (min=3,message = "Name should be of 3 characters")
    private String userName;

    @NotBlank(message = "Password can not be empty")
    @Size (min=3,message = "Password should be of 3 characters")
    private String password;

    public LoginUser() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
