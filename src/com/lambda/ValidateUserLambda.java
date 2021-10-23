package com.lambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*@Welcome to user registration problem
 *@application-This program validates user name,email etc using lambda expressios.
 *@author-deepak
 *@since-22/10/21
 * */

public class ValidateUserLambda {

    /*
     * Adding Functional Interface, which is used to declare an interface as
     * functional interface.
     */
    @FunctionalInterface
    interface DataValidate {
        void Validator();
    }

    public static void main(String[] args) {
        /*
         * Using Lambda Function For The First Name
         */
        DataValidate FirstName = () -> {
            Scanner sc = new Scanner(System.in);
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            System.out.println("Enter your First Name: ");
            String name = sc.next();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches())
                System.out.println("First Name is valid");
            else
                System.out.println("First Name is not valid");
        };
        FirstName.Validator();


        /*
         * Using Lambda Function For The Last Name
         */
        DataValidate LastName = () -> {
            Scanner sc = new Scanner(System.in);
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            System.out.println("Enter your Last Name: ");
            String name = sc.next();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches())
                System.out.println("Last Name is valid");
            else
                System.out.println("Last Name is not valid");
        };
        LastName.Validator();
        /*
         * Using Lambda Function For The EMail
         */
        DataValidate EMail = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Email Id: ");
            String email = sc.next();
            Pattern pattern = Pattern.compile("^([a-z0-9]+.)+@([a-z0-9]+.)([a-z]+.)[a-z]{2,3}+$");
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches())
                System.out.println("Given Email Id is Valid");
            else
                System.out.println("Given Email Id is not valid");
        };
        EMail.Validator();
        /*
         * Using Lambda Function For The Mobile Number
         */
        DataValidate Mobile = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Mobile Number: ");
            String mobile = sc.nextLine();
            Pattern pattern = Pattern.compile("^[0-9]{2}[ ]{1}[0-9]{10}+$");
            Matcher matcher = pattern.matcher(mobile);
            if (matcher.matches())
                System.out.println("Mobile Number Is Valid");
            else
                System.out.println("Mobile number is not valid");
        };
        Mobile.Validator();
    }
}
