package com.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {
    private final Map<Integer, User> userDb = new HashMap<>();
    private int counter = 1;

    public List<User> getAll() {
        return new ArrayList<>(userDb.values());
    }

    public User findById(int id) {
        return userDb.get(id);
    }

    public User save(User user) {
        user.setId(counter++);
        userDb.put(user.getId(), user);
        return user;
    }

    public User update(int id, User updatedUser) {
        updatedUser.setId(id);
        userDb.put(id, updatedUser);
        return updatedUser;
    }

    public void delete(int id) {
        userDb.remove(id);
    }
}

