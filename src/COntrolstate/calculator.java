package COntrolstate;
import java.util.Scanner;
//. Create a calculator program where users can select an operation (+, -, *, /, %). Based on their
//choice, perform the calculation on two input numbers. Include error handling for invalid operations
//and division by zero.
public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Enter symbol +,-,/,% ");
        char symbol=sc.next().charAt(0);
        switch(symbol){
            case '+':System.out.println("addition "+(a+b));
                     break;
            case '-':System.out.println("subtraction "+(a-b));
                     break;
            case '*':System.out.println("multiplication "+(a*b));
                      break;
            case '/': if(b==0){
                         System.out.println("division by zero algorithm");
                         break;
                         }
                      System.out.println("division "+(a/b));
            case '%': if(b==0){
                        System.out.println("division by zero algorithm");
                        break;
                      }
                      System.out.println("modulus division "+(a%b));


        }
    }
}
