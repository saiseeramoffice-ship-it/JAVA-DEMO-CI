package com.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    @Test
    public void testLogin() {

        Login login = new Login();

        String result = login.login("Karthik");

        assertEquals(
            "Karthik logged in successfully",
            result
        );
    }
}