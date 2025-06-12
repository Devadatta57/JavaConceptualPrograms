package Stringgrams;


import java.util.Arrays;

class Anagra{
    public static boolean isAna(String name1,String name2){

        if(name1==null || name2==null){
            return  false;
        }
        name1= name1.toLowerCase().replace(" ","");
        name2=name2.toLowerCase().replace(" ","");

        if(name1.length()!=name2.length()){
            return false;
        }

        char[]  c1=name1.toCharArray();
        char[]  c2=name2.toCharArray();


        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}
public class AnagramPractise {
    public static void main(String[] args) {
        String name1 = "heart";
        String name2 = "earth";
        boolean result = Anagra.isAna(name1, null);
        if (result)
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }
}