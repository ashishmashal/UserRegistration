package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationOprations {
    public static final Scanner scanner = new Scanner(System.in);
    static Pattern patternObject;
    static Matcher matcherObject;
    static boolean Return;

    /*
    Method For Validation for Last Name
     */
   public static String validFirstName(String name) throws InvalidUserException {
        try {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            patternObject = Pattern.compile(regex);
            matcherObject = patternObject.matcher(name);
           Return = matcherObject.matches();
            if (Return)
                return "First name is valid.";
            else
                throw new InvalidUserException("First name is invalid.");
        }
        catch (Exception e){
            throw new InvalidUserException("Invalid first name.");
        }
    }
    public static String validLastName(String lastName) throws InvalidUserException {
        try {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
             patternObject = Pattern.compile(regex);
            matcherObject = patternObject.matcher(lastname);
           Return = matcherObject.matches();
            if (Return)
                return "Last name is valid.";
            else
                throw new InvalidUserException("Last name is invalid.");
        }
        catch (Exception e){
            throw new InvalidUserException("Invalid last name.");
        }
    }
    public static String validEmail(String email) throws InvalidUserException {
        try {
            String regex = "^[a-z]{3}[a-zA-Z0-9-.+_]{0,}+@[a-zA-Z0-9]{1,}(?:\\.([a-zA-Z0-9-]+){2,})*$";
            patternObject = Pattern.compile(regex);
            matcherObject = patternObject.matcher(email);
           Return = matcherObject.matches();
            if (Return)
                return "Email is valid.";
            else
                throw new InvalidUserException("Email is invalid.");
        }
        catch (Exception e){
            throw new InvalidUserException("Invalid email.");
        }
    }
    public static String validMobileNo(String mobileNo) throws InvalidUserException {
        try {
            String regex = "^[1-9]{1}[0-9]{0,2}\\s[1-9]{1}[0-9]{9}$";
            patternObject = Pattern.compile(regex);
            matcherObject = patternObject.matcher(mobileNo);
           Return = matcherObject.matches();
            if (Return)
                return "Mobile no. is valid.";
            else
                throw new InvalidUserException("Mobile no. is invalid.");
        }
        catch (Exception e){
            throw new InvalidUserException("Invalid Mobile no.");
        }
    }
    public static String validPassword(String password) throws InvalidUserException {
        try {
            String regex = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[a-z])(?!.*[<>`])(?=[^.,:;'!@#$%^&*_]*[.,:;'!@#$%^&*_][^.,:;'!@#$%^&*_]*$).{8,}$";
             patternObject = Pattern.compile(regex);
            matcherObject = patternObject.matcher(password);
           Return = matcherObject.matches();
            if (Return)
                return "Password is valid.";
            else
                throw new InvalidUserException("Password is invalid.");
        }
        catch (Exception e){
            throw new InvalidUserException("Invalid password.");
        }
    }
}
