package logicalprograms;
import java.util.Scanner;
class primenum {
    public static boolean checkNumPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {//if num=5 (checking from 2-4 tables not 1 and 5)becoz it is a prime numb if it is div other than 1 and itself
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}

public class primeNumber {
    public static void main(String[] args) {
            System.out.println("enter number");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            while (number < 0) {
                System.out.println("number entered is negative number enter again");
                number = sc.nextInt();
            }

            boolean result = primenum.checkNumPrime(number);

            if (result)
                System.out.println(number + " is prime number");
            else {
                System.out.println(number + " is not a prime number");
            }

        }


    }

