package allconcptprograms;
import java.util.Scanner;
public class conditionalstate {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a,b,c");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       //optimised code
       if(a<b){//a smaller -true
           if(a<c){//a smaller-true
               System.out.println("a is least");
           }else{//c-smaller
               System.out.println("c is least");
           }
       }else if(b<c){//a greater,b-samller
           System.out.println("b is least");
       }else{//c-smaller
           System.out.println("c is least");
       }
       //unoptimised
       /*
        if(a<b){
             if(a<c){
                 System.out.println("a is least "+a);
             }
        }
        if(b<c){
            if(b<a){
                System.out.println("b is least "+b);
            }
        }
        if(c<a){
            if(c<b) {
                System.out.println("c is least" + c);
            }
        }

        */

    }
}
