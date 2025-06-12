package logicalprogramspractice;

public class Stringss {
    public static void main(String[] args) {
//        String s="devadatta";
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            count++;
//        }
//        System.out.println(count);

        String s="devad#&^^$atta";
        int count=0;
        for(int i=0;i<s.length();i++){
//            if(s.charAt(i) =='#' || s.charAt(i)=='&' || s.charAt(i)=='^' || s.charAt(i)=='$'){
//                count++;
//            }
            if(s.charAt(i)=='a' || s.charAt(i)=='e'){
                System.out.println(s.charAt(i));
                count++;
            }
        }
        System.out.println(count);
    }
}
