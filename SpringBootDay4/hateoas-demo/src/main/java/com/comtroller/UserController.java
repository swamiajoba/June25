package com.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public EntityModel<User> getUserById(@PathVariable int id) {
        User user = userService.findById(id);
        if (user == null) throw new RuntimeException("User not found");

        return EntityModel.of(user,
            linkTo(methodOn(UserController.class).getUserById(id)).withSelfRel(),
            linkTo(methodOn(UserController.class).getAllUsers()).withRel("all-users"),
            linkTo(methodOn(UserController.class).deleteUser(id)).withRel("delete"),
            linkTo(methodOn(UserController.class).updateUser(id, user)).withRel("update")
        );
    }

    @GetMapping
    public CollectionModel<EntityModel<User>> getAllUsers() {
        List<EntityModel<User>> users = userService.getAll().stream()
            .map(user -> EntityModel.of(user,
                linkTo(methodOn(UserController.class).getUserById(user.getId())).withSelfRel()
            )).collect(Collectors.toList());

        return CollectionModel.of(users,
            linkTo(methodOn(UserController.class).getAllUsers()).withSelfRel()
        );
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        return ResponseEntity.ok(userService.update(id, user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

