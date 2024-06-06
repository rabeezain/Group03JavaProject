package Zerrin.Week06;

public class string_PasswordValidation {


    public static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }

            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {

        String[] passwords = {"Zer@444", "zer444", "Zer444", "Zer 444", "Zer@44"};

        for (String password : passwords) {
            System.out.println("Password: " + password + " -> " + isValidPassword(password));
        }
    }
}

