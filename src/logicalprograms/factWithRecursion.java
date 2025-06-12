package logicalprograms;
import java.util.Scanner;
class factWithoutRec{
    public static int fact(int number){
        if(number==0 || number==1)
            return 1;
        else
            return number*fact(number-1);
    }
}
public class factWithRecursion {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        while(number<0){
            System.out.println("number given is negative number, enter number again" );
            number=sc.nextInt();
        }
       int result= factWithoutRec.fact(number);
        System.out.println(result+" result" );


    }
}
