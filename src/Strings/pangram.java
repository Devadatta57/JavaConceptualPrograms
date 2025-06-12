package Strings;
//pangram
class pan{
    public  static boolean ispangram(String name){
        boolean[] temp=new boolean[26];
        name=name.toLowerCase();
        int index=0;
        boolean res=true;
       for(int i=0;i<name.length();i++){
           char ch=name.charAt(i);
           if(ch>='a' && ch<='z'){
               index=ch-'a';
               temp[index]=true;
           }
       }
       for(int i=0;i<temp.length;i++){
           if(temp[i]==false){
               res=false;
               break;
           }
       }
       return  res;
    }
}
public class pangram {
    public static void main(String[] args) {
        boolean finalres=pan.ispangram("The Quick brown fox jumps over the lazy dog");
        if(finalres)
            System.out.println("pangram");
        else
            System.out.println("not pangram");

    }
}

