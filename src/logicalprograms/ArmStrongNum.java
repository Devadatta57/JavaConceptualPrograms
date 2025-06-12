package logicalprograms;
import java.util.Scanner;
class Armstrong{
    public static boolean arms(int number){
        int length=(number+"").length();
      //  System.out.println("length "+length);
        int sum=0;
        int originalnumber=number;
        while(number>0){
            int rem=number%10;
            sum=(int)(sum+Math.pow(rem,length));
            number=number/10;
        }
     //   System.out.println(sum+" sum");
        if(sum==originalnumber)
            return true;
        else
            return false;
    }
}
public class ArmStrongNum {
    public static void main(String[] args) {
      System.out.println("Enter number: ");
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      while(number<0){
          System.out.println("number is negative number enter again ");
          number=sc.nextInt();
      }
        boolean result=Armstrong.arms(number);


      if(result)
        System.out.println(number+" is a armstrong number");
      else
          System.out.println(number+" is not a armstrong number");
    }
}
