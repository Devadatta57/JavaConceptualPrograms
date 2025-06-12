package Stringgrams;


import java.util.Arrays;

class Pangram{
    public static boolean  isPangram(String sen){
      //  sen=sen.replace(" ","").toLowerCase();
       sen=sen.replaceAll("[^a-z ]","").toLowerCase();

        char[] c=sen.toCharArray();
        Arrays.sort(c);
        boolean result[]=new boolean[26];
        for(char i:c){
            if(i>='a' && i<='z') {
                int index = i - 'a';
                result[index] = true;
            }

        }
        for(boolean r:result){
            if(r==false){
          //  System.out.println(r);
                return false;
            }
        }
        return  true;
    }

}
public class pangrampractise {
    public static void main(String[] args) {
     String sen="The quick brown fox jumps over the lazy dog";
      boolean res= Pangram.isPangram(sen);
     System.out.println(res);
    }
}
