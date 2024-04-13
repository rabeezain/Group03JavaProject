package arbon.week3;



public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseNumber(-35));


    }

    public static int reverseNumber(int num){
        int rev = 0; //
        while(num != 0){//we let the loop continue as long as it is not equal to zero
            rev = rev*10 + num %10; //reverse=0 * 10 + number(-35)%10= -5; second iteriation rev becomes -50 +(-3) = -53
            num = num /10;// we divide given number by 10 and the result -3 we store it to num variable
        }
        return rev;
    }

}
