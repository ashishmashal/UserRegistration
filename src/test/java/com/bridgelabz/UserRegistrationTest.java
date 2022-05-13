package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    //Valid Test Cases
    @Test
    public void TestFor_FirstNameValidation(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.validFirstName("Ashish");
        Assertions.assertTrue(result);
    }
    @Test
    public void TestFor_LastNameValidation(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.validLastName("Mashal");
        Assertions.assertTrue(result);
    }
    @Test
    public void TestFor_emailValidation(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.validEmail("ashish@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void TestFor_MobileNOValidation(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.Mobile_Number("91 8380805787");
        Assertions.assertTrue(result);
    }
    @Test
    public void TestFor_PasswordValidation(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.validPassword("Ashish@1");
        Assertions.assertTrue(result);
    }

    //Invalid Test Cases
    @Test
    public void TestFor_InvalidFirstName(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.validFirstName("Ashish");
        Assertions.assertFalse(result);
    }
    @Test
    public void TestFor_InvalidLastNamen(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.validLastName("Mashal");
        Assertions.assertFalse(result);
    }
    @Test
    public void TestFor_InvalidEmail(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.validEmail("ashish@gmail.com");
        Assertions.assertFalse(result);
    }
    @Test
    public void TestFor_InvalidMobileNO(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.Mobile_Number("91 8380805787");
        Assertions.assertFalse(result);
    }
    @Test
    public void TestFor_InvalidPassword(){
        UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();
        boolean result = userRegistrationOprations.validPassword("Ashish@1");
        Assertions.assertFalse(result);
    }
}
