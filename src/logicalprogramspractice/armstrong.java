package logicalprogramspractice;
import java.util.Optional;
import java.util.Scanner;
class  AmstrongCheck {
    public static boolean armstrong(int number) {
        int n = number;
        int length = (number + "").length();
        int orignum = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
          //  System.out.println(rem);
            int power=(int)(Math.pow(rem,length));
            sum=sum+power;
            n = n / 10;
        }
        if (sum == orignum) {
            return true;
        } else {
            return false;
        }
    }
}
public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        boolean result=AmstrongCheck.armstrong(n1);
        System.out.println(result);
    }
}
