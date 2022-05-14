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
    public static boolean validFirstName(String name) throws InvalidUserException{
//        System.out.print("Enter the First Name : ");
//        String name = scanner.next();
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
    public static boolean validLastName(String lastname) throws InvalidUserException{
//        System.out.print("Enter the Last Name : ");
//        String lastname = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        patternObject = Pattern.compile(regex);
        matcherObject = patternObject.matcher(lastname);
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
    public static boolean validEmail(String email ) throws InvalidUserException{
//        System.out.print("Enter the Email : ");
//        String email = scanner.next();
        String regex = "^[a-z0-9]+@[a-z0-9]+.[a-z]{2,3}+.[a-z]{2,}$";
        patternObject = Pattern.compile(regex);
        matcherObject = patternObject.matcher(email);
        Return = matcherObject.matches();

        if (Return)
            System.out.println("Email is valid.");
        else
            System.out.println("Email is invalid.");
        return Return;
    }

    /*
    Method For Validation for Mobile No
     */

    public static boolean Mobile_Number(String mobile_number)throws InvalidUserException{
//        System.out.println("Enter the Mobile Number : ");
//        String mobile_number=scanner.nextLine();
        //Expression for mobile Number
        String regex ="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        patternObject =Pattern.compile(regex);
        matcherObject=patternObject.matcher(mobile_number);
        Return = matcherObject.matches();

        //Checking whether entered MobileNo is valid pr not
        if(Return)
            System.out.println("Entered Mobile Number is Valid");
        else
            System.out.println("Entered Mobile Number is Invalid");
        return Return;
    }
    /*
        Method For Validation for Password
     */
    public static boolean validPassword(String password) throws InvalidUserException{
//        System.out.println("Enter the Password Having Minimum 8 Character: ");
//        String password=scanner.next();
        //Expression for Password
        //At-least One Spacial Character
        String regex="^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8}$";

        //Creating pattern object
        patternObject =Pattern.compile(regex);
        matcherObject=patternObject.matcher(password);
        Return = matcherObject.matches();


        if(Return)
            System.out.println("Entered password is Valid");
        else
            System.out.println("Entered password-d is Invalid");
        return Return;
    }

}
