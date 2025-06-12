package CollectionMaps;

import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Map;

public class Linkedhashmapcricket {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> h=new LinkedHashMap<>();
        h.put("kohli",h.getOrDefault("kohli",0)+45);
        h.put("hardik",h.getOrDefault("hardik",0)+5);
        h.put("dhoni",h.getOrDefault("dhoni",0)+75);
        h.put("zmar",h.getOrDefault("zmar",0)+22);
        h.put("amla",h.getOrDefault("amla",0)+34);
        h.put("potr",h.getOrDefault("potr",0)+66);
        h.put("laxc",h.getOrDefault("laxc",0)+1);
        h.put("laxc",h.getOrDefault("laxc",0)+34);


//        for(Map.Entry<String,Integer> entry: h.entrySet()){
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }

        String[] str={"kohli","hardik","dhoni","zmar","amla","potr","laxc","fait","boip"};
        for(String s:str){
             System.out.println(s+" : "+h.getOrDefault(s,0));
        }



    }
}
