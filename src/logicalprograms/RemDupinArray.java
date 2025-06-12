package logicalprograms;
import java.util.Scanner;
public class RemDupinArray {
    public static void RemDup(int[] a){
        int[] temp=new int[a.length];
        boolean notexist;
        int index=0;
       // if(a.length==0 || a.length ==1){
        //    return;
       // }
        for(int i=0;i<a.length;i++){
            notexist=true;
            for(int j=0;j<temp.length;j++){
                   if(a[i]==temp[j]){
                    notexist=false;
                    break;
                   }
            }
            if(notexist)
                temp[index++]=a[i];
        }

        int fin[]=new int[index];
        for(int i=0;i<index;i++){
            fin[i]=temp[i];
        }
        for(int i=0;i<fin.length;i++){
            System.out.print(fin[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int len=sc.nextInt();
        int[] a=new int[len];

        if(len<=0){
            System.out.println("Invalid array length");
            return;
        }
        for(int i=0;i<a.length;i++){
            System.out.println("Enter element at index "+i);
            a[i]=sc.nextInt();
        }
        System.out.println("entered array is");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        RemDup(a);


    }
}
