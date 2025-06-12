package patterns;

public class pyramidpattern {
    public static void main(String[] args) {
        int n=5;
        // for upperpyramid
        /*
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for stars
            for(int k=1;k<=(2*i)-1;k++){
                    System.out.print("* ");
            }
            System.out.println();

        }
         */
        //for lower half pyramid
        /*
        for(int i=n;i>=1;i--){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for stars
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
         */
    }
}
