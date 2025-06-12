package Java8features;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(-11,345,23,232,45,67,89,11);

        long count=list.stream().count();

        System.out.println(count);
        System.out.println("-------------------------------------");
        list.stream().filter(i->i<0).forEach(n->System.out.println(n));

        System.out.println("-------------------------------------");
        list.stream().filter(i->(i%3==0) && (i%5==0)).forEach(n->System.out.println(n));

        System.out.println("-------------------------------------");
        list.stream().sorted().forEach(n->System.out.println(n+" "));

        System.out.println("-------------------------------------");
        list.stream().sorted(Collections.reverseOrder()).forEach(n->System.out.println(n));

        System.out.println("-------------------------------------");
        list.stream().sorted().forEach(n->System.out.println(n));

        System.out.println("-------------------------------------");
        list.stream().sorted().limit(5).forEach(n->System.out.print(n+" "));


        System.out.println("-------------------------------------");
        list.stream().sorted(Collections.reverseOrder()).skip(5).forEach(n->System.out.print(n+" "));

        System.out.println("-------------------------------------");
//List<Integer> numbersdividedby9 =list.stream().filter(i->i%9==0).toList();
        List<Integer> numbersdividedby9 =list.stream().filter(i->i%9==0).collect(Collectors.toList());

        System.out.println("-------------------------------------");
        Set<Integer> set=list.stream().filter(i->i%3==0).collect(Collectors.toSet());
        System.out.print(new TreeSet<Integer>(set));

    }
}
