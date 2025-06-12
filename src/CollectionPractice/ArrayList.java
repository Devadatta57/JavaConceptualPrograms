package CollectionPractice;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> al=new java.util.ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
//       for(int i=1;i<=5;i++){
//           int n=sc.nextInt();
//           al.add(n);
//       }
        al.add(23);
        al.add(5);
        al.add(88);
        al.add(55);

//       al.set(4,56);
//
//        for(int x:al){
//            System.out.println(x);
//        }
//        System.out.println(al.get(2));
//        System.out.println(al.contains(56));
//        System.out.println(al.contains("hbnv h"));
//        System.out.println(al.indexOf(34));
//        System.out.println(al.indexOf(67));
//        al.set(2,456);
//        al.add(2,567);
//        System.out.println(al.get(2));
//        System.out.println(al.remove(2));
//        System.out.println(al);
        java.util.ArrayList<String> we=new java.util.ArrayList<String>();
        we.add("red");
        we.add("yellow");
        we.add("green");
        we.add("yellow");
        we.add("white");
        we.add("black");
//        for(int i=0;i<=5;i++){
//            String n=sc.next();
//            we.add(n);
//        }
        //we can sort arraylist with integers,floats becox they are bydefault comparable
        Collections.sort(al);
        System.out.println(al);
        System.out.println(we.contains("orange"));
        System.out.println(we.get(2));
        System.out.println(we.indexOf("red"));
        System.out.println(we.lastIndexOf("orange"));
        System.out.println(we.remove("yellow"));
        System.out.println(we);
        System.out.println(we.remove(2));
        System.out.println(we.subList(1,4));


    }
}
