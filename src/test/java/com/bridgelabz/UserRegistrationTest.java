package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationOprations userRegistrationOprations = new UserRegistrationOprations();


    //Valid Test Cases
    @Test
        public void TestFor_FirstNameValidation() {
            try {

                Assertions.assertTrue(userRegistrationOprations.userValidateFirstName.validate("Ashish"));
            }
            catch (InvalidUserException e)
            {
                System.out.println("Exception Occurs\n"+ e);
            }
    }
    @Test
    public void TestFor_LastNameValidation(){
        try {
            Assertions.assertTrue(userRegistrationOprations.userValidateLastName.validate("Mashal"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_emailValidation(){
        try {
            Assertions.assertTrue(userRegistrationOprations.userValidateEmail.validate("ashish@gmail.com"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_MobileNOValidation(){
        try {
            Assertions.assertTrue(userRegistrationOprations.userValidateMobileNo.validate("91 8833445566"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_PasswordValidation(){
        try {
            Assertions.assertTrue(userRegistrationOprations.userValidatePassword.validate("Ashish@1"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }

    //Invalid Test Cases
    @Test
    public void TestFor_InvalidFirstName(){
        try {
                Assertions.assertFalse(userRegistrationOprations.userValidateFirstName.validate("ashish"));
            }
            catch (InvalidUserException e)
            {
                System.out.println("Exception Occurs\n"+ e);
            }
    }
    @Test
    public void TestFor_InvalidLastNamen(){
        try {
            Assertions.assertFalse(userRegistrationOprations.userValidateLastName.validate("mashal"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_InvalidEmail(){
        try {
            Assertions.assertFalse(userRegistrationOprations.userValidateEmail.validate("ashish..@gmail.com"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_InvalidMobileNO(){
        try {
            Assertions.assertFalse(userRegistrationOprations.userValidateMobileNo.validate("8833445566"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    @Test
    public void TestFor_InvalidPassword(){
        try {
            Assertions.assertFalse(userRegistrationOprations.userValidatePassword.validate("ashish1"));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    public void TestFor_Null(){
        try {
            Assertions.assertFalse(userRegistrationOprations.userValidatePassword.validate(null));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
    public void TestFor_Empty(){
        try {
            Assertions.assertFalse(userRegistrationOprations.userValidatePassword.validate(""));
        }
        catch (InvalidUserException e)
        {
            System.out.println("Exception Occurs\n"+ e);
        }
    }
}
