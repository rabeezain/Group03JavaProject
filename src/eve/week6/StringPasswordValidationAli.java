package eve.week6;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringPasswordValidationAli {

    /*
    String_PasswordValidation
Write a return method that can verify if a password is valid or not.
-Requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
     */

    public static boolean isValidPassword(String password) {
        return password.length() >= 6 &&
                password.chars().anyMatch(Character::isUpperCase) &&
                password.chars().anyMatch(Character::isLowerCase) &&
                password.chars().anyMatch(p -> !Character.isLetterOrDigit(p)) &&
                password.chars().anyMatch(Character::isDigit) &&
                password.chars().noneMatch(p -> p == ' ');
    }

    public static boolean isValidPassword1(String password) {
        int length = password.length();
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        return length >= 6 && hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("He lloB!o1"));
        System.out.println(isValidPassword1("HelloB!o1"));

    }
}
