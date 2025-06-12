package Arrays;
import java.util.Scanner;
//  Create a program to reverse the elements in an array. For example, if the input array is {1, 2, 3,
//4,5}, the output should be {5, 4, 3, 2, 1}.
class RevArray{
      public static void revA(int[] a){
          int temp[]=new  int[a.length];
          int index=0;
          for(int i=a.length-1;i>=0;i--){
              temp[index]=a[i];
              index++;
          }
          for(int i=0;i<temp.length;i++){
              System.out.print(temp[i]+" ");
          }
      }
}
public class reverseAnArray {
    public static void main(String[] args) {
        System.out.println("enter array ");
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        RevArray.revA(a);
    }
}
