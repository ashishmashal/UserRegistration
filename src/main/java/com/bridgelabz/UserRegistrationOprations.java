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
    public static boolean validFirstName() {
        System.out.print("Enter the First Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
         patternObject = Pattern.compile(regex);
         matcherObject = patternObject.matcher(name);
        boolean Return = matcherObject.matches();

        if (Return)
            System.out.println("First name is valid.");
        else
            System.out.println("First name is invalid.");
        return Return;
    }
    /*
    Method For Validation for Last Name
     */
    public static boolean validLastName() {
        System.out.print("Enter the Last Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        patternObject = Pattern.compile(regex);
        matcherObject = patternObject.matcher(name);
        Return = matcherObject.matches();

        if (Return)
            System.out.println("Last name is valid.");
        else
            System.out.println("Last name is invalid.");
        return Return;
    }
    /*
    Method For Validation for Email
     */
    public static boolean validEmail()
    {
        System.out.print("Enter the Email : ");
        String email = scanner.next();
        String regex = "^[a-z0-9]+@[a-z0-9]+.[a-z]{2,3}+.[a-z]{2,}$";
        patternObject= Pattern.compile(regex);
        matcherObject= patternObject.matcher(email);
        Return = matcherObject.matches();

        if (Return)
            System.out.println("Email is valid.");
        else
            System.out.println("Email is invalid.");
        return Return;
    }
}
