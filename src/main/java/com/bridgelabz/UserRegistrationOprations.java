package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface UserValidate{
    boolean validate(String message) throws InvalidUserException;
}

public class UserRegistrationOprations{
    public static final Scanner scanner = new Scanner(System.in);
    static Pattern patternObject;
    static Matcher matcherObject;
    static boolean Return;

    /*
    Method For Validation for Last Name
     */
    UserValidate userValidateFirstName = FirstName->{
//        System.out.print("Enter the First Name : ");
//        String name = scanner.next();

        if (FirstName == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (FirstName.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        patternObject = Pattern.compile(regex);
        matcherObject = patternObject.matcher(FirstName);
        boolean Return = matcherObject.matches();

        if (Return)
            System.out.println("First name is valid.");
        else
            System.out.println("First name is invalid.");
        return Return;
    };

    /*
    Method For Validation for Last Name
     */
    UserValidate userValidateLastName = LastName->{
//        System.out.print("Enter the Last Name : ");
//        String lastname = scanner.next();
        if (LastName == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (LastName.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        patternObject = Pattern.compile(regex);
        matcherObject = patternObject.matcher(LastName);
        Return = matcherObject.matches();

        if (Return)
            System.out.println("Last name is valid.");
        else
            System.out.println("Last name is invalid.");
        return Return;
    };

    /*
    Method For Validation for Email
     */
    UserValidate userValidateEmail = Email->{
//        System.out.print("Enter the Email : ");
//        String Email = scanner.next();
        if (Email == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (Email.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
//        System.out.print("Enter the Email : ");
//        String email = scanner.next();
        String regex = "^[a-z0-9]+@[a-z0-9]+.[a-z]{2,3}+.[a-z]{2,}$";
        patternObject = Pattern.compile(regex);
        matcherObject = patternObject.matcher(Email);
        Return = matcherObject.matches();

        if (Return)
            System.out.println("Email is valid.");
        else
            System.out.println("Email is invalid.");
        return Return;
    };

    /*
    Method For Validation for Mobile No
     */

    UserValidate userValidateMobileNo = MobileNo->{
//        System.out.print("Enter the Mobile No : ");
//        String MobileNo = scanner.next();
        if (MobileNo == null) {
            throw new InvalidUserException("Null Pointer Exception");
        } else if (MobileNo.length() == 0) {
            throw new InvalidUserException("Empty Exception ");
        }
//        System.out.println("Enter the Mobile Number : ");
//        String mobile_number=scanner.nextLine();
        //Expression for mobile Number
        String regex ="^[0-9]{2}\\s{0,1}[0-9]{10}$";
        patternObject =Pattern.compile(regex);
        matcherObject=patternObject.matcher(MobileNo);
        Return = matcherObject.matches();

        //Checking whether entered MobileNo is valid pr not
        if(Return)
            System.out.println("Entered Mobile Number is Valid");
        else
            System.out.println("Entered Mobile Number is Invalid");
        return Return;
    };
    /*
        Method For Validation for Password
     */
    UserValidate userValidatePassword= Password->{
//        System.out.println("Enter the Password Having Minimum 8 Character: ");
//        String password=scanner.next();
        //Expression for Password

        //At-least One Spacial Character

        String regex="^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8}$";


        //Creating pattern object
        patternObject =Pattern.compile(regex);
        matcherObject=patternObject.matcher(Password);
        Return = matcherObject.matches();


        if(Return)
            System.out.println("Entered password is Valid");
        else
            System.out.println("Entered password is Invalid");
        return Return;
    };

}
