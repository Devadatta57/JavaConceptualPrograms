package Java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FltMpExmple {
        public static void main(String[] args) {
            List<List<Integer>> listoflists =new ArrayList<List<Integer>>();

            listoflists.add(Arrays.asList(10,40,23,63,78));
            listoflists.add(Arrays.asList(20,-53,77,99,88));
            listoflists.add(Arrays.asList(-17,-93,133,66,89));

//listoflists.stream().flatMap(list->list.stream()).forEach(s->System.out.println(s+" "));
            listoflists.stream().flatMap(list->list.stream()).filter((element)->(element%9==0)).forEach(s->System.out.println(s+" "));

    }
}
