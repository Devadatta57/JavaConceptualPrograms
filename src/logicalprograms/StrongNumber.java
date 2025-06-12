package logicalprograms;
import java.util.Scanner;
class StrongNum{
    public static boolean checkStrong(int number){
       int originalnum=number;
       int result=0;
       while(number>0){
           int rem=number%10;
           int fact=1;
          // for(int i=1;i<=rem;i++){
             //  fact=fact*i;
           //}
          // result=result+fact;
           result=result+recFact(rem);
           number=number/10;
       }
       if(result==originalnum)
           return true;
       else
           return false;

    }
    public static int recFact(int rem){
        if(rem==0 || rem==1 )//base case
            return 1;
        else
            return rem * recFact(rem-1);//recursive case
    }
}
public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while(num<=0){
            System.out.println("Enter again:");
            num=sc.nextInt();
        }
        boolean result=StrongNum.checkStrong(num);
        if(result)
            System.out.println(num+" is a strong number");
        else
            System.out.println(num+" is not a strong number");

    }
}
