package patterns;
/*
public class diamond {
    public static void main(String[] args) {
                int n=5;
                for(int i=1;i<=n;i++){
                    //for spaces
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    //for stars
                    for(int k=1;k<=(2*i)-1;k++){
                        System.out.print("*");
                    }
                    System.out.println();

                }

          //for lower pyramid
             for(int i=n-1;i>=1;i--){
                 //for spaces
                  for(int j=1;j<=(n-i);j++){
                      System.out.print(" ");
                  }
                  //for stars
                  for(int k=1;k<=(2*i)-1;k++){
                     System.out.print("*");
                  }
                  System.out.println();
             }
    }
}
 */

public class diamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int k=1;k<=(2*i)-1;k++){
                if(k==1 ||  k==(2*i)-1)//for border diamond
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

        //for lower pyramid
        for(int i=n-1;i>=1;i--){
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int k=1;k<=(2*i)-1;k++){
                if(k==1  || k==(2*i)-1)//for border
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
