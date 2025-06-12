package PriorityQueue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class priority {
    public static void main(String[] args) {
//        PriorityQueue<Integer> p =new PriorityQueue<Integer>();
//        p.add(123);
//        p.add(3);
//        p.add(8);
//        p.add(-121);
//        p.add(0);
//        System.out.println(p);
////        while(!p.isEmpty()){
////            System.out.println(p.poll());
////        }
//        System.out.println(p.isEmpty());
//        System.out.println(p.contains(121));
//        System.out.println(p.contains(-121));
//     //   p.clear();
//        System.out.println(p);

        ArrayDeque<Integer>  a=new ArrayDeque<Integer>();
        a.add(120);
        a.add(-34);
        a.add(67);
        a.add(66);
        a.add(44);
        a.add(45);
        a.add(-1);
        System.out.println(a);
        System.out.println(a.contains(121));
        System.out.println(a.peek());
        System.out.println(a.poll());
        System.out.println(a);
        a.addFirst(78);
        System.out.println(a);
        a.removeLast();
        System.out.println(a);




    }
}
