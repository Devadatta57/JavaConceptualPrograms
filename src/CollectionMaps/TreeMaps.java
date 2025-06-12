package CollectionMaps;

import java.util.TreeMap;
import java.util.HashSet;
import java.util.Map;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<Integer,String> h=new TreeMap<>();
        h.put(1,"deva");
        h.put(2,"darha");
        h.put(63,"yoga");
        h.put(4,"skipping");
        h.put(1,"deva");
        h.put(2,"darha");
        h.put(3,"yoga");
        h.put(4,"skipping");
//        h.put(null,"float");
//        h.put(null,"kslfd");
//        System.out.println(h.containsKey(1));
//        System.out.println(h.containsValue("deva"));
//        System.out.println(h.keySet());
//        System.out.println(h.values());
//        h.replace(4,"goat");
//        h.remove(4);
    //    System.out.println(h);


        for(Map.Entry<Integer,String> entry : h.entrySet()){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }

       // System.out.println(h.get(4567));
    }
}

