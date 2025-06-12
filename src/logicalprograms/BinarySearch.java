package logicalprograms;
import java.util.Scanner;
//works only when array is sorted check it before you use
class Binary{
    public static void sorting(int a[]){//call by ref array (a) in this method reflects the changes in the array(a) created in the main method even diff becoz of call by ref
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static int checkbinary(int[] a,int key) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
              return mid;
              //break; use break when u not return key and print key in the same method
            }
            else if(a[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
       // if(low>high)
          //  System.out.println("key not found "+key);
      return -1;
    }
}
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];

        System.out.println("Enter array ");

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        Binary.sorting(a);

        System.out.println("Array after sorting ");

        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+" ");
        }

        System.out.println();

        System.out.println("Enter element to be searched ");

        int key=sc.nextInt();

        while(key<0){
            System.out.println("element negative enter again ");
            key=sc.nextInt();
        }
       int result=Binary.checkbinary(a,key);//sorted array(a) in sorting method  and here passed array(a) diff
        //but sorted array reflects the change in the array created in main method becoz of call by ref
        if(result!=-1)
            System.out.println("key found at "+result);
        else
            System.out.println("key not found");




    }
}
