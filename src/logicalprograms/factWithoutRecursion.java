package logicalprograms;
import java.util.Scanner;
class factWithRec{
    public static int fact(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
}
public class factWithoutRecursion {
    public static void main(String[] args) {
        System.out.println("Enter number ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        /*//if u given neg numb if condition checked and number taken but ctrl will not go to else cond becoz only one cond will execute in both if and else so use instead while loop
        if(number<0){
            System.out.println("number given is negative number, enter number again" );
            number=sc.nextInt();
        }else{
            System.out.println(factWithRec.fact(5));
        }
         */
        while(number<0){
            System.out.println("number given is negative number, enter number again" );
            number=sc.nextInt();
        }
        System.out.println(factWithRec.fact(number));
        sc.close();
    }
}
