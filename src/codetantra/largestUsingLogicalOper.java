package codetantra;
//. Write a program that takes three integer inputs. use logical operators (&&, ||, !) to find the largest
//number among them without using if-else or ternary operators.
public class largestUsingLogicalOper {
    public static void main(String[] args) {
        int a=6;int b=6;int c=5;
        int largest=(a>=b && a>=c) ? a : (b>=c && b>=a) ? b : c;//ternary
        System.out.println(largest);
    }
}
