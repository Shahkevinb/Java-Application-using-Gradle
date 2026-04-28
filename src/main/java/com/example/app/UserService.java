package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * UserService - Demonstrates managing dependencies and business logic.
 */
public class UserService {
    
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private final List<String> users;
    
    public UserService() {
        this.users = new ArrayList<>();
        initializeUsers();
    }
    
    private void initializeUsers() {
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        logger.debug("Initialized {} users", users.size());
    }
    
    public void displayUsers() {
        logger.info("Displaying all users:");
        for (String user : users) {
            System.out.println("  - " + user);
        }
    }
    
    public List<String> getUsers() {
        return new ArrayList<>(users);
    }
    
    public void addUser(String name) {
        users.add(name);
        logger.info("Added user: {}", name);
    }
    
    public int getUserCount() {
        return users.size();
    }
}