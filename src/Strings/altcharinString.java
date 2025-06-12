package Strings;

public class altcharinString {
    public static void main(String[] args) {
        String str="deva";
        String str2="kanakadurga";
        String s="";
        for(int i=0;i<str.length() ||i<str2.length();i++){
                if(i<str.length()){
                   s=s+str.charAt(i);
                }
                if(i<str2.length()){
                   s=s+str2.charAt(i);
                }

            }
        System.out.println(s);
        }


    }

