package Strings;
import java.util.Arrays;
//anagram
class ana{
    public static boolean isana(String name1,String name2){
        name1=name1.replace(" ","");
        name2=name2.replace(" ","");
        if(name1.length()!=name2.length()){
            return false;
        }
       name1=name1.toLowerCase();
       name2=name2.toLowerCase();
       char[] ch1=name1.toCharArray();
       char[] ch2=name2.toCharArray();

       Arrays.sort(ch1);
       Arrays.sort(ch2);
       int index=0;
      // boolean[] temp= new boolean[name1.length()];
       boolean result=Arrays.equals(ch1,ch2);
       return result;

    }
}
public class anagram  {
    public static void main(String[] args) {
        String name1 = "heart";
        String name2 = "earth";
        boolean result = ana.isana(name1, name2);
        if (result)
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }
}