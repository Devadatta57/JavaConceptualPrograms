package logicalprogramspractice;
import java.util.Scanner;
class primeCheck{
    public static boolean prime(int n1){
        boolean isPrime=true;
        for(int i=2;i<=n1/2;i++){
            if(n1%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void  primerange(int start,int end){
        for(int i=start;i<=end;i++){
            boolean isPrime=true;
            for(int y=2;y<=i/2;y++){
                if(i%y==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i + " ");
            }
        }
    }
}
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
         primeCheck.primerange(n1,n2);
        //boolean result=primeCheck.prime(n1);

        //System.out.println(result);
    }
}
