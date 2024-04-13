package arbon.week3;

public class PrimeNumbers {
    /*
    Write a method that can check if a number is prime or not.
    Prime number is a number that is divisible only by 1 and by itself. So ,every number that is divided in total only by two numbers
    is prime number
    
     */
    public static void main(String[] args) {
        ispPrime(12);
    }

    public static void ispPrime(int num){

        int divided = 0;
        for (int i = 1; i <= num; i++){
           if(num % i == 0){//we check for given number how many times it is divisible and the remainder 0
               divided++;//if it is divisible we increase divided by 1
           }
        }
        if(divided == 2){ //in the end we check if it is only divisible by 2 numbers, then it is a prime number
            System.out.println("Given number is prime number");
        }else{
            System.out.println("Given number is not prime number");
        }

    }
}
