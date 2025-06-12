package allconcptprograms;
import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int[] a={3,5,7,12,45};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter key: ");
        int key=sc.nextInt();
        int low=0;//should be  0 i.e index(not a[0] i.e value )
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
         if(a[mid]==key){
             System.out.println("key found at index "+mid);
             break;
         }
         else if(a[mid]<key){
             low=mid+1;
         }else {
             high=mid-1;
         }
        }
        if(low>high){
            System.out.println("key not found "+low+" low "+high+" high");
        }
    }
}
