package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogoutTest {

    @Test
    public void testLogout() {

        Logout logout = new Logout();

        String result = logout.logout("Karthik");

        assertEquals(
                "Karthik logged out successfully",
                result
        );
    }
}