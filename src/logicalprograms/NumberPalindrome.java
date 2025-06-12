package logicalprograms;
import java.util.Scanner;
class Palindrome{
    public  static boolean palind(int number){
        int originalnumber=number;
        int rev=0;

        while(number>0){
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
        }
        if(rev==originalnumber)
            return true;
        else
            return false;

    }
}
public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while(num<=0){
            System.out.println("Enter again:");
            num=sc.nextInt();
        }
        boolean result=Palindrome.palind(num);

        if(result)
            System.out.println("Palindrome " + num);
        else
            System.out.println("Not Palindrome "+ num);

    }
}
