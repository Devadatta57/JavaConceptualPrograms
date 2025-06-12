package logicalprograms;
import java.util.Scanner;
class Perfect{
    public static boolean checkPerfect(int number){
        int sum=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0)
                sum=sum+i;
        }
        if(sum==number)
            return true;
        else
            return false;
    }
}
public class perfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while(num<=0){
            System.out.println("Enter again:");
            num=sc.nextInt();
        }
        boolean result=Perfect.checkPerfect(num);
        if(result)
            System.out.println(num+" is a perfect number");
        else
            System.out.println(num+" is not a perfect number");

    }
}
