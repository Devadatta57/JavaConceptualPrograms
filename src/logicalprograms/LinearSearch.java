package logicalprograms;
import java.util.Scanner;

class Linear{
    public static  int checklinear(int[] a,int key){
       // boolean keyfound=false;
        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                return i;
            }
        }
        return -1;
    }
}
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter array ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter element to be searched ");
        int key=sc.nextInt();
        while(key<0){
            System.out.println("element negative enter again ");
             key=sc.nextInt();
        }
        System.out.println("element found at index "+Linear.checklinear(a,key));
    }
}
