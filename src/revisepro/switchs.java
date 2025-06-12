package revisepro;
import java.util.Scanner;
public class switchs {
    public static void main(String[] args) {

       // while (true) {
            System.out.println("Enter choice : 1,2,3,4,5");
            System.out.println("1. Addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. modulus");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Addition");
                    System.out.println("Enter  two numbers");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("sum:" + (a + b));
                    break;
                case 2:
                    System.out.println("subtraction");
                    System.out.println("Enter  two numbers");
                     a = sc.nextInt();
                     b = sc.nextInt();
                    System.out.println("subtrac:" + (a - b));
                    break;
                case 3:
                    System.out.println("multiplication");
                    System.out.println("Enter  two numbers");
                     a = sc.nextInt();
                     b = sc.nextInt();
                    System.out.println("mult:" + (a * b));
                    break;
                case 4:
                    System.out.println("division");
                    System.out.println("Enter  two numbers");
                     a = sc.nextInt();
                     b = sc.nextInt();
                     if(b<=0){
                         System.out.println("div by zero");
                     }else {
                         System.out.println("division:" + (a / b));
                     }
                    break;
                case 5:
                    System.out.println("modulus");
                    System.out.println("Enter  two numbers");
                     a = sc.nextInt();
                     b = sc.nextInt();
                    System.out.println("modul:" + (a % b));
                   return;
                default:
                    System.out.println("invalid choice");
                    break;
            }
       // }


    }
}
