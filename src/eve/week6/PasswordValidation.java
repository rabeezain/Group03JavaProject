package eve.week6;

public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(passwordValidation("Amasya05."));

    }




    public static boolean passwordValidation(String password){
        if(password.length() < 6 || password.contains(" ")){
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;
        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }else if(Character.isDigit(ch)){
                hasDigit = true;
            }else{
                hasSpecialCharacter = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;
    }
}
