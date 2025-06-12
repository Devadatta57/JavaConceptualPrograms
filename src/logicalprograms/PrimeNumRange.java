package logicalprograms;
import java.util.Scanner;
class primeRange {
    public static void checkprimeRange(int start, int end) {
        for (int y = start; y <= end; y++) {
           // if (y < 2) {
             //   continue;
           // }
            boolean isPrime = true;
            for (int i = 2; i <= y / 2; i++) {
                if (y % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(y + " is a prime numb in range " + start + " " + end);

        }
    }

}
public class PrimeNumRange {
    /*
    public static boolean checkstartEnd(int start,int end){
        if((start<end) && (start>0 && end>0)){//if 20>2 ||-1<0 ||-5<0
            return true;
        }
        else{
            return false;
        }
    }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter start");
        int start = sc.nextInt();

        System.out.println("enter end");
        int end=sc.nextInt();

        if((start<end) && (start>0 && end>0)){//if 2<20 && 2,20 +ve numbs
            primeRange.checkprimeRange(start,end);
        }
        else {
            System.out.println("range not correct");
        }

        /*
        if( start>end || start<0 || end<0 ){//if 20>2 ||-1<0 ||-5<0
             System.out.println("enter start");
             start = sc.nextInt();

             System.out.println("enter end");
             end=sc.nextInt();
            primeRange.checkprimeRange(start,end);
        }
        else{
            primeRange.checkprimeRange(start,end);
        }
         */

    }
}

