package patterns;
//fullname pattern
public class namepattern {
    public static void printD(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || (i==0 && j<(n-1)) ||(j==(n-1) && i>0 && i<(n-1)) ||  (i==(n-1) && j<(n-1))){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printE(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==(n-1) || (i==(n/2))){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printV(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == i || j == (2 * n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        System.out.println();
    }
    /*
    public static void printA(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( (j==0 && i>0) || (j==(n-1)/2 && i>0) || (i==0 && j>0 && j<(n-1)/2) || (i==(n)/2 && j<(n)/2))
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
     */
    public static void printA(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( (j==0 && i>0) || (j==(n-1) && i>0) || (i==0 && j>0 && j<(n-1)) || (i==(n)/2 && j<(n-1)))
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printT(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==(n)/2)
                    System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
/*
        printD(5);
        printE(5);
        printV(5);
        printA(10);
        printD(5);
        printA(10);
        printT(5);
        printT(5);
        printA(10);
 */
        printD(5);
        printE(5);
        printV(5);
        printA(5);
        printD(5);
        printA(5);
        printT(5);
        printT(5);
        printA(5);


    }
}
