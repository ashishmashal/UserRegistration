package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem");
        System.out.println("----------------------------------------");
        int ans;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter Your Choice " +
                    "\n1.Validate First Name  " +
                    "\n2.Validate Last Name " +
                    "\n3.Validate Email "
                    );

            int Option = scanner.nextInt();
            switch (Option) {
                case 1:
                    UserRegistrationOprations.validFirstName();
                    break;
                case 2:
                    UserRegistrationOprations.validLastName();
                    break;
                case 3 :
                    UserRegistrationOprations.validEmail();
                    break;
                default:
                    System.out.println("Enter Valid No");
                    break;
            }
            System.out.println("If Continue Press 1 ");
            ans = scanner.nextInt();
        }while(ans == 1);


    }
}
