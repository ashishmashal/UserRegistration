package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();

    //Valid Test Cases
    @Test
        public void TestFor_FirstNameValidation() {
            try {
                Assertions.assertTrue(UserRegistrationOprations.validFirstName("Ashish"));
            }
            catch (InvalidUserException e)
            {
                System.out.println("Exception Occurs\n"+ e);
            }
    }
    @Test
    public void TestFor_LastNameValidation(){
        try {
            Assertions.assertTrue(UserRegistrationOprations.validLastName("Mashal"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_emailValidation(){
        try {
            Assertions.assertTrue(UserRegistrationOprations.validEmail("ashish@gmail.com"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_MobileNOValidation(){
        try {
            Assertions.assertTrue(UserRegistrationOprations.Mobile_Number("91 8833445566"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_PasswordValidation(){
        try {
            Assertions.assertTrue(UserRegistrationOprations.validPassword("Ashish@1"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
/*
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

 */
}
