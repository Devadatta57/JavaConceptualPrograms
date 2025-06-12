package Java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StremExmple2 {
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        l.add(Arrays.asList(2, -45, 67, 89, 56, 32));
        l.add(Arrays.asList(27, -45, 6, 8, 569, 2));
        l.add(Arrays.asList(2,-45,678,889,569,8));

       // l.stream().flatMap(list->list.stream()).forEach(n->System.out.print(n+" "));
        l.stream().flatMap(list->list.stream()).filter(i->i%9==0).forEach(n->System.out.print(n+" "));

    }
}
