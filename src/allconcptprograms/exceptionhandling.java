package allconcptprograms;
/*
public class exceptionhandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
           System.out.println("Division by zero error");
        }catch(InputMismatchException e){
            System.out.println("input not matched");
        }

    }
}
 */
/*
public class exceptionhandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int[] a=new int[10];
            System.out.println("Enter index");
            int index = sc.nextInt();
            System.out.println("Enter value");
            int value = sc.nextInt();
            a[index]=value;
            System.out.println(a[index]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array length crossed");
        }
        catch(InputMismatchException e){
            System.out.println("input not matched");
        }

    }
}
 */
//try with resource any resources support autocloseable ,any resource like scanner,bufferreader will be closed automatically
/*
public class exceptionhandling {
    public static void main(String[] args) {
         try(Scanner sc=new Scanner(System.in)){
            // System.out.println("Enter name");
            // String a=sc.nextLine();//any i/p taken as string so input mismatch if u want that except store String  in int number then it will raise exception
             System.out.println("Enter int");
            int i=sc.nextInt();
             System.out.println(i);
         }
//         catch(InputMismatchException e){
//             e.printStackTrace();
//         }
         catch(Exception e){
         //e.printStackTrace();
            System.out.println(e.getMessage());

         }
    }
    }

 */

//public class exceptionhandling {
//    public static void main(String[] args) {
//
//         try{
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter ");
//            int a=sc.nextInt();
//            int b= sc.nextInt();
//            int c=a/b;
//            System.out.println(c);
//            //only subclasses with | parent class cant be joined
//         }catch(ArithmeticException|InputMismatchException  e){
//              System.out.println("Exception raised");
//         }
//         catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//    }
//    }

//class A{
// void m1()throws ArithmeticException{
//     int a=10;
//     int b=0;
//     int c=a/b;
//     System.out.println(c);
// }
//}
//class  B extends A {
//    void m1(){//no problem even if u wont tell exception will raise by throws in  signature if u wont specify the exceptiob but handle it
//        try{
//        int a=10;
//        int b=0;
//        int c = a / b;
//        }catch(Exception e) {
//            System.out.println("exception raised by zero division");
//        }
//    }
//}
//public class exceptionhandling {
//    public static void main(String[] args) {
//    A obj=new B();
//    obj.m1();
//    }
//    }

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
//parent throws unchecked exeception,so child method not forced by compiler to handle it
//class A{
// void m1()throws ArithmeticException{
//     int a=10;
//     int b=0;
//     int c=a/b;
//     System.out.println(c);
// }
//}
//class  B extends A {
//    void m1(){//no problem even if u wont tell exception will raise by throws in  signature if u wont specify the exceptiob but handle it
//        try{
//            System.out.println("Enter a number");
//            Scanner sc=new Scanner(System.in);
//            int b=sc.nextInt();
//        }catch(InputMismatchException e) {
//            System.out.println("exception raised by zero division");
//        }
//    }
//}
//public class exceptionhandling {
//    public static void main(String[] args) {
//    A obj=new B();
//    obj.m1();
//    }
//    }


//internally exception class in parent m1() is unchecked exceptio compiler not forces to declare in signature /handle it in child
//class A{
//    void m1()throws Exception {
//       System.out.println("Enter");
//       Scanner sc=new Scanner(System.in);
//       int a=sc.nextInt();
//    }
//}
//class  B extends A {
//    void m1(){
//        System.out.println("Enter");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//    }
//}
//public class exceptionhandling {
//    public static void main(String[] args) {
//        A obj=new B();
//        //even unchecked exception why we arehandling it main method while calling becoz to change system-defined cod eto user-friendly msg to user
//////        try {
////            obj.m1();
//////        }catch (Exception e){
//////            System.out.println(e);
//////        }
//    }
//}

class company{
    public void division(){
          System.out.println("Connection established");
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1:");
        int n3=0;
        try {
            int n1 = sc.nextInt();
            System.out.println("Enter n2:");
            int n2 = sc.nextInt();
            n3 = n1 / n2;
            System.out.println(n3);
        }catch(InputMismatchException | ArithmeticException e){
            System.out.println("exception");
        }
        System.out.println("connection terminated");
    }
}
public class exceptionhandling {
   public static void main(String[] args) {
       company c=new company();
       c.division();

}
}