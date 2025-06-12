package COntrolstate;
import java.util.Scanner;
//Write a program to determine whether a given year is a leap year. A leap year is divisible by 4 but not by 100
// unless it’s also divisible by 400.
//A year is a leap year if it is divisible by 4 and not divisible by 100, OR if it is divisible by 400.
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();
        if( (year % 4==0 &&  year%100!=0) || (year%400==0) )
            System.out.println("leap year");
        else
            System.out.println("not leap year");

    }
}
