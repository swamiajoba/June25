package com.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {
    private final Map<Integer, User> userDb = new HashMap<>();
    private int counter = 1;
    
    public UserService() {
    	
    	userDb.put(1, new User(1,"Ram","ram@abc.com"));
    	userDb.put(2, new User(2,"Sham","sham@abc.com"));
    	
    }

    public List<User> getAll() {
        return new ArrayList<>(userDb.values());
    }

    public User findById(int id) {
        return userDb.get(id);
    }

}
