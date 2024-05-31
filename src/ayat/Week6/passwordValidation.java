package ayat.Week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class passwordValidation {
    public static void main(String[] args) {
        //Write a return method that can verify if a password is valid or not.
//-Requirements:
//Password MUST be at least have 6 characters and should not contain space
//PassWord should at least contain one upper-case letter
//PassWord should at least contain one lowercase letter
//Password should at least contain one special character
//Password should at least contain a digit
//-if all requirements above are met, the method returns true, otherwise returns  false
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the password:");
//        String pass = input.nextLine();
//        input.close();
//        if (passwordValid(pass)) System.out.println("The password is valid.");
//        else System.out.println("The password " + pass + " is not valid.");


        if (!passwordValid("A1s@a")) System.out.println("The password \"A1s@a\" should be at least 6 characters.");
        if (!passwordValid("A1s@a ")) System.out.println("The password \"A1s@a \" should not contain space.");
        if (!passwordValid("as1@kk"))
            System.out.println("The password \"as1@kk\" should at least contain one uppercase letter");
        if (!passwordValid("AA1@JJ"))
            System.out.println("The password \"AA1@JJ\" should at least contain one lowercase letter");
        if (!passwordValid("aaA123"))
            System.out.println("The password \"aaA123\" should at least contain one special character");
        if (!passwordValid("aaA@ss")) System.out.println("The password \"aaA@ss\" should at least contain a digit");
        if (passwordValid("A1@asdf")) System.out.println("The password \"A1@asdf\" is valid");

    }

    public static boolean passwordValid(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean upperCaseFlag = false;
        boolean lowerCaseFlag = false;
        boolean digitFlag = false;
        boolean specialCharFlag = false;
        boolean allFlags = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                specialCharFlag = true;
            } else if (Character.isDigit(ch)) {
                digitFlag = true;

            }

        }
        allFlags = upperCaseFlag && lowerCaseFlag && digitFlag && specialCharFlag;
        return allFlags;
    }


}