package logicalprograms;
import java.util.Scanner;
class Gcd{
    public static int gcd(int num1,int num2){
        int gcd=0;
      for(int i=2;i<=num1/2 && i<=num2/2;i++){
          if(num1%i==0 && num2%i ==0){
              gcd=i;
          }
      }
      return gcd;
    }
}
public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if (num1 > 0 && num2 > 0) {
            System.out.println(Gcd.gcd(16,8));
        }
       else{
            System.out.println("negative enter again :");
            num1=sc.nextInt();
            num2=sc.nextInt();
            System.out.println(Gcd.gcd(16,8));
        }

    }
}
