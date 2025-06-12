package CollectionPractice;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("deva");
        h.add("datta");
        h.add("react");
        h.add("resie");
        h.add("ncxgd");
        h.add("deva");
        h.add("datta");
        h.add("react");
        h.add("resie");
        h.add("ncxgd");
        h.add(null);
        h.add(null);
//        for(String s:h){
//            System.out.println(s);
//        }
//     System.out.println(s);
        System.out.println(h);
        h.contains("deva");


    }
}
