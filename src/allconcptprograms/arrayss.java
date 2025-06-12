package allconcptprograms;
import java.util.Scanner;
import java.util.Arrays;

public class arrayss {
    public static void main(String[] args) {
        /*
        int[] a=new int[5];
        a[0]=34;
        a[1]=56;
        a[4]=6;
        // a[7]=6;
        int[] b={45,78};
        int[] c;//declaration
        c=new int[4];//instantiation
        c[3]=56;//initialization
        char[] d={'r','i','p','u'};

         */
        /*
        int[] a=new int[4];
        a[0]=78;
        a[1]=56;
        //a[7]=78;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
         */

        //2d
        /*
        int[][]  a = new int[2][3];//2rows,3col
        a[0][0]   =1;
        a[0][1]   =2;
        a[0][2]   =3;
        a[1][0]   =4;
        a[1][1]   =5;
        a[1][2]   =6;
      //  a[4][5]   =56;
       int g= a.length;//gives rows of array
       //System.out.println(a[i].length);//array rowlength gives column length

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

         */
        //2d jagged
        /*

        int[][] a=new int[2][];
        a[0]=new int[2];
        a[0][0]=7;
        a[0][1]=87;
        a[1]=new int[3];
        a[1][0]=45;
        a[1][1]=78;
        a[1][2]=66;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

         */


        /*
        int[][] a={
                {5,6},
                {3,6,7,8},
                {3,5,7,8,8,9}
        };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

         */
        //3d
        /*
        int[][][] a=new int[2][][];//no.of 2d arrays,no.of rows,no.of columns
         a[0]=new int[2][];
         a[1]=new int[3][];

         a[0][0]=new int[2];
         a[0][1]=new int[3];

         a[1][0]=new int[1];
         a[1][1]=new int[2];
         a[1][2]=new int[3];

         a[0][0][0]=3;
         a[0][0][1]=1;

         a[0][1][0]=7;
         a[0][1][1]=5;
         a[0][1][2]=1;



         a[1][0][0]=2;
         //a[1][0][1]=5;
         a[1][1][0]=6;
         a[1][1][1]=1;

         a[1][2][0]=5;
         a[1][2][1]=12;
         a[1][2][2]=2;

        for(int i=0;i<a.length;i++){//no.of 2d arrays
             for(int j=0;j<a[i].length;j++){//no.of rows in 1 array
                 for(int k=0;k<a[i][j].length;k++){//no.of columns in a row with rowslength
                     System.out.print(a[i][j][k]+" ");
                 }
                 System.out.println();
             }
         }

         */
        /*

        int[][][] a={
                {
                        {1,3},
                        {3,5,7}

                },
                {
                        {1,3,4},
                        {3,5,6},
                        {4,6,7}
                },
                {
                        {1,4},
                        {3,6},
                        {4,7}
                }

        };
        for(int i=0;i<a.length;i++){//no.of 2d arrays
            for(int j=0;j<a[i].length;j++){//no.of rows in 1 array
                for(int k=0;k<a[i][j].length;k++){//no.of columns in a row with rowslength
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

         */

        int[][] we,er;

        we=new int[][] {
                {23, 56, 67},
                {5,6}
              };
        er=new int[][]{
                {3,45},
                {2,345,65}
        };

        /*
        int[] x1={4,6,7};
        for(int i=0;i<x1.length;i++){
            System.out.print(x1[i]+" ");
        }
        Arrays.fill(x1,0,2,555);
        for(int i=0;i<x1.length;i++){
            System.out.print(x1[i]+" ");
        }
        Arrays.fill(x1,66);
        for(int i=0;i<x1.length;i++){
            System.out.print(x1[i]+" ");
        }
         */

        //sum of array
        /*
        int[] a={4,6,7,8};
        int sum=0;
        for(int i=0;i<a.length;i++){
             sum=sum+a[i];
        }
        System.out.print(sum);
         */

        //taking user input array
        /*
        int[] a=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array ");
        for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        int[][] l[],t[];

       // int[][] []f;

         */

        //sorting an array
        /*
        int[] a={4,6,8,2,1};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
         */

        //minmax of an array
        int a[]={5,4,3,8,78,89,1};

        /*
        int min=a[0];

        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);

        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);

         */
        //optimised code of min,max
        int min=a[0];
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        int[] c,d[];
        c=new int[9];
        d=new int[2][3];

    }
}
