package Arrays;

import java.util.Scanner;
//Write a Java Program to accept 25 integer elements for an array then find the maximum number
// in  the set and display it.
class maxInSet {
    public static void main(String[] args) {
        int[] a=new int[25];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("all the elements entered");
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("max is "+max);

    }
}
