package com.example.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for UserService.
 */
class UserServiceTest {
    
    private UserService userService;
    
    @BeforeEach
    void setUp() {
        userService = new UserService();
    }
    
    @Test
    void testInitialUserCount() {
        assertEquals(3, userService.getUserCount());
    }
    
    @Test
    void testGetUsers() {
        assertNotNull(userService.getUsers());
        assertEquals(3, userService.getUsers().size());
    }
    
    @Test
    void testAddUser() {
        userService.addUser("David");
        assertEquals(4, userService.getUserCount());
        assertTrue(userService.getUsers().contains("David"));
    }
}