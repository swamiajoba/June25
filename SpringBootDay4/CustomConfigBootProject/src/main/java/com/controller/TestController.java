package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.props.DatabaseConfigProperties;
import com.props.ServerProperties;

// Controller to test Properties POJOs
@RestController
@RequestMapping("/properties")
public class TestController {

    // Field Injection
    @Autowired
    ServerProperties serverProperties;

    // Field Injection
    @Autowired
    DatabaseConfigProperties databaseConfigProperties;

    // Get Server Properties
    @GetMapping("/server")
    public ServerProperties getServerProperties() {
        return serverProperties;
    }

    // Get Database Properties
    @GetMapping("/database")
    public DatabaseConfigProperties getDatabaseProperties() {
        return databaseConfigProperties;
    }
}
