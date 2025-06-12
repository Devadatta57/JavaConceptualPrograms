package logicalprogramspractice;

import java.util.Arrays;
import java.util.Locale;

public class anagram {
    public static void main(String[] args) {
        String s="sil ent";
        String s2="lioue N ";
        s=s.replace(" ","").toLowerCase();
        s2=s2.replace(" ","").toLowerCase();

        char c[]=s.toCharArray();
        char c2[]=s2.toCharArray();
        if(c.length==c2.length) {
            Arrays.sort(c);
            Arrays.sort(c2);

            if (Arrays.equals(c, c2)) {
                System.out.println("equals");
            } else {
                System.out.println("not");
            }
        }
        else{
            System.out.println("not anagrams");
        }


    }
}
