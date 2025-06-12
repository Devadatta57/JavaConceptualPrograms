package CollectionPractice;
import  java.util.LinkedHashSet;
//maintains order
public class LinkedhashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> h=new LinkedHashSet<String>();
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
        System.out.println(h.contains("resie"));


    }
}
