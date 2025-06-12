package logicalprogramspractice;

import java.util.Arrays;

public class Stringpalindrome {
    public static void main(String[] args) {
        String s="madam sir toot radar hello";
        String[] str=s.split(" ");
        String[] palindromes = new String[str.length];
        int index=0;

        for(int i=0;i<str.length;i++){
            String rev="";
            String word=str[i];
           // System.out.println(word);
            //for palindrome
            for(int j=(str[i].length()-1);j>=0;j--){
                rev=rev+word.charAt(j);
              //  System.out.println(rev);
            }

            if(rev.equals(str[i])){
                palindromes[i]=rev;
                index++;
               // System.out.println(word +" is palindrome");
            }
        }
        int maxlength=0;
//        for(int i=0;i<palindromes.length;i++){
//            if(palindromes[i]!=null ) {
//                if(palindromes.length>maxlength){
//                    maxlength=palindromes.length;
//                }
//
//            }
//        }
   String maxword="";
        for(String wrd:palindromes){
            if(wrd!=null){
                if(maxlength<wrd.length()){
                    maxlength=wrd.length();
                    maxword=wrd;
                }
            }
        }
        System.out.println(maxlength+" "+maxword);

    }
}
