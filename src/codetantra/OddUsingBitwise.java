package codetantra;
//Write a program or method that finds whether a number is odd without using modulus (%),
//division (/), or conditional (if) statements. explain your approach.
public class OddUsingBitwise {
    public static void main(String[] args) {
        int n=6;
        boolean result=checkOdd(6);
        System.out.println(result?"odd":"even");

    }
    public static boolean checkOdd(int n){
        return  ((n & 1)==1);//1000 & 0001 =0001(binary representation)(and gate( 1 & 1 -1,1&0-0,0&0-0)
    }
}
