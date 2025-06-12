package Java8features;

import java.util.*;
import java.util.stream.Collectors;

public class Streamex2practise {
    public static void main(String[] args) {
//List<Integer> list= Arrays.asList(12,15,18,21);
//        long count=list.stream().count();
//        System.out.println(count);
      //  list.stream().filter(i->i<0).forEach(i->System.out.println(i+" "));
       //  list.stream().filter(i->(i%3==0) &&(i%5==0)).forEach(i->System.out.println(i+" "));
        //list.stream().sorted(Collections.reverseOrder()).forEach((n)->System.out.print(n+" "));
       // list.stream().sorted().forEach((n)->System.out.print(n+
       // list.stream().skip(5).forEach((n)->System.out.print(n+" "));
      // List<Integer> result= list.stream().filter((i)->i%9==0).collect(Collectors.toList());//.forEach(n->System.out.println(n+" "));
        //System.out.println(result);
       // Set<Integer> l=list.stream().filter((i)->i%3==0).collect(Collectors.toSet());
      //  System.out.println(new TreeSet<Integer>(l));

        List <Integer> l=Arrays.asList(-12,45,67,8,94,34,56,8,77,-8);
      //  System.out.println(l);
       // l.stream().filter(i->i<0).forEach((n)->System.out.print(n+" "));
       // l.stream().filter((i)->(i%3==0) && (i%5==0)).forEach((n)->System.out.print(n+" "));
      // List<Integer> list= l.stream().sorted().collect(Collectors.toList());
      // System.out.println(list);
//        Set<Integer> list=l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toSet());
//        System.out.println(new TreeSet<Integer>(list));

//        Set<Integer> list=l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toSet());
//        System.out.println(new TreeSet<Integer>(list).stream());

     // l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toSet()).stream().limit(2).forEach((n)->System.out.println(n+ " "));
        l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toSet()).stream().skip(2).forEach((n)->System.out.println(n+ " "));




    }
}
