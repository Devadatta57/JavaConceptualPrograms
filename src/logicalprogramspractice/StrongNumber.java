package logicalprogramspractice;

import java.util.Scanner;


class StrongCheck{
    public static boolean strong(int n) {
        int ori = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + facto(rem);
            n = n / 10;
        }
        if(sum==ori){
            return true;
        }
        else{
            return false;
        }
    }

        public static int facto(int rem){
            if(rem==0 || rem==1){
                return 1;
            }
            else {
                return rem * facto(rem - 1);
            }
        }



}
public class StrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       boolean result=StrongCheck.strong(num);
       System.out.println(result);
    }
}
