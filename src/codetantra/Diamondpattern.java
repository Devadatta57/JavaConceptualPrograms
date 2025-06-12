package codetantra;
/*
public class Diamondpattern {
    public static void main(String[] args) {
        int n=12;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( i+j== (n-1)/2 || i-j==(n-1)/2  || j-i ==(n-1)/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }

}
 */
/*
public class Diamondpattern {
    public static void main(String[] args) {
        int n = 5;
        //upper pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k == 1 || k == (2 * i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        //lower pyramid

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (k == 1 || k == (2 * i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

    }
}

 */

public class Diamondpattern {
    public static void main(String[] args) {
        int n = 5;
        //upper pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
            }
            System.out.println();

        }

        //lower pyramid

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
            }

            System.out.println();

        }

    }
}