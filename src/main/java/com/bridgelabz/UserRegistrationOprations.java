package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationOprations {
    public static final Scanner sc = new Scanner(System.in);

    /*
    Method For Validation for Last Name
     */
    public static boolean validFirstName() {
        System.out.print("Enter the First Name : ");
        String name = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern patternObject = Pattern.compile(regex);
        Matcher matcherObject = patternObject.matcher(name);
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
        String name = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();

        if (r)
            System.out.println("Last name is valid.");
        else
            System.out.println("Last name is invalid.");
        return r;
    }
}
