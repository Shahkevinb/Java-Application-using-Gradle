package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main application entry point.
 * Demonstrates a Java application built with Gradle.
 */
public class MainApplication {
    
    private static final Logger logger = LoggerFactory.getLogger(MainApplication.class);
    
    public static void main(String[] args) {
        logger.info("Starting Java Application using Gradle");
        
        UserService userService = new UserService();
        userService.displayUsers();
        
        logger.info("Application completed successfully");
    }
}