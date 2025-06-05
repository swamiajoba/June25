package com.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterUser {
    private String user;
    private String hobbies[];
    private String gender;
    private List<String> items;

    private Map<String,String> props;

    public RegisterUser() {
    }

    public RegisterUser(String user, String[] hobbies, String gender, List<String> items) {
        this.user = user;
        this.hobbies = hobbies;
        this.gender = gender;
        this.items = items;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public Map<String, String> getProps() {
        return props;
    }

    public void setProps(Map<String, String> props) {
        this.props = props;
    }
}
