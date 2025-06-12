package codetantra;
import java.util.Scanner;
class lett {
    public static void printA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i == 0 && j > 0 && j < n / 2) || (j == 0 && i >= 1 && i <= (n - 1)) || (j == n / 2 && i > 0 && i <= (n - 1)) || (i == n / 2 && j >= 0 && j <= n / 2))
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
    public static void printB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((j==0 && i>=0 && i<=(n-1)) || (i==0 && j>=0 && j<n/2) || (j==n/2 && i>0 && i<n/2) ||  (i==(n)/2 && j>=0 && j<n/2) || (j==n/2 && i>n/2 && i<(n-1))|| (i==(n-1) && j>=0 && j<n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
    public static void printG(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( (j==0  &&  i>0 && i<(n-1) || (i==0 && j>0 && j<n/2) || (i==(n-1) && j>0 && j<n/2)) || (j==(n-1)/2 && i>=(n-1)/2  & i<(n-1)) || (j==n/2 && i>=(n-1)/2  && j<=(n-1)))
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
    public static void printS(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( (i==0 && j>0 && j<=n/2) || (j==0 && i>0 && i<n/2) || ( i==n/2 && j>0 && j<n/2) || (j==n/2 && i>n/2 && i<(n-1)) || (i==n-1 && j>=0 && j<n/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
    public static void printN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0 || j==n-1 || i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
    public static void printX(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || i+j == (n-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
public class letters {
    public static void main(String[] args) {
        // lett.printA(10);
         //lett.printB(11);
          // lett.printG(10);
       // lett.printS(11);
      //  lett.printN(10);
         lett.printX(11);

    }

}
