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
    /*  Test cases for valid emails */
    @Test
    public void givenEmailList_WhenAllTrue_ShouldReturnTrue(){
        ArrayList<String> emailList = new ArrayList<>(Arrays.asList("abc@yahoo.com", "abc-100@yahoo.com",
                "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"));
        for (int i=0; i<emailList.size(); i++) {
            boolean result = userRegistration.validEmail(emailList.get(i));
            Assertions.assertTrue(result);
        }
    }
    /*  Test cases for invalid emails */
    @Test
    public void givenEmailList_WhenAllFalse_ShouldReturnTrue(){
        ArrayList<String> emailList = new ArrayList<>(Arrays.asList("abc", "abc@.com.my",
                "abc123@gmail.a", "abc123@.com", "abc@.com.com", ".abc@abc.com",
                "abc()*@gmail.com", "abc@%*.com", "abc@abc@gmail.com"));
        for (int i=0; i<emailList.size(); i++) {
            boolean result = userRegistration.validEmail(emailList.get(i));
            Assertions.assertFalse(result);
        }
    }
}
