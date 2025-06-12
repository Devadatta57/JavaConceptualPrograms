package logicalprogramspractice;

import java.util.Scanner;

class palindromenumber{
    public static boolean  palindrome(int num){
        int rev=0;
        int ori=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==ori){
            return true;
        }else{
            return false;
        }
    }
}
public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean result=palindromenumber.palindrome(num);
        System.out.println(result);
    }
}
