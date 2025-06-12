package revisepro;
import java.util.Scanner;
class prime {
    public static boolean primen(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primerange(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + " ");

        }

    }

      public  static int NthPrime(int n){
        int count=0;
        int nth=0;
        while(count<n)
           for(int i=2;count<n;i++){//10<10(count<n),(i<100)97 prime numb
               boolean isPrime=true;
               for(int j=2;j<=i/2;j++){
                   if(i%j==0){
                       isPrime=false;
                       break;
                   }
               }
               if(isPrime){
                   count++;
                  nth=i;
                  }

           }
        return nth;
      }

}
public class primenumber {
    public static void main(String[] args) {
        /*
        System.out.println("Enter number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n<=0){
            System.out.println("invalid");
            n=sc.nextInt();
        }
        boolean res=prime.primen(n);
        if(res){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
         */

        /*
        System.out.println("Enter number a & b ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=0 || b<=0 || a>b){
            System.out.println("invalid enter again");
            a=sc.nextInt();
            b=sc.nextInt();
        }
        prime.primerange(a,b);


       // prime.primerange();
         */

        int res=prime.NthPrime(10);
        System.out.println(res);
    }
}
