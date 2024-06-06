package arbon.week06;

public class String_PasswordValidation {
    public static void main(String[] args) {

        System.out.println(isPasswordStrong("Cydeo12!"));
    }

    public static boolean isPasswordStrong(String password){

        boolean hasAtLeast8Chars = password.length() >= 6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for(int i =0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpperCase=true;
            }else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }else {
                hasSpecialChar = true;
            }
        }
        boolean isStrongPassword = hasAtLeast8Chars && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        if(password.contains(" ")){
            return false;
        }
        if(isStrongPassword){
            return true;
        }else{
            return false;
        }


    }
}
/*
Write a return method that can verify if a password is valid or not.
-Requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */