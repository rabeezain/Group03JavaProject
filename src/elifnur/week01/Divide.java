package elifnur.week01;

public class Divide {
    /*
    Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
     */
    public static void main(String[] args) {
        int x=23;
        int y=2;
        int z=1;
        int a=11;
        if (x>=y){
            System.out.println("you can try divide ");
            if (z==0 && (a*y)==x ){
                System.out.println(x+" divide "+y);
            }else{
                System.out.println("you cannot divide "+x+" to " +y+" oddment "+z);
            }
        }

    }
}
