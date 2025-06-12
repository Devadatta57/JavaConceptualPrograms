package CollectionPractice;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedlistExample {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<=5;i++){
//            String n=sc.next();
//            l.add(n);
//        }
        l.add("deva");
        l.add("wera");
        l.add("era");
        l.add("iop");
        l.add("cvb");
        l.add("deva");
        l.add("wera");
        l.add("era");
        l.add("iop");
        l.add("cvb");

//        for(String s:l){
//            System.out.println(s);
//        }
        l.addFirst("datta");
        System.out.println(l);
        l.remove();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);



    }
}
