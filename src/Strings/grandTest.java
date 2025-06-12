package Strings;
/*
public class grandTest {
    public static void main(String[] args) {
        int a=2;
        int b=8;
        int gcd=0;
        for (int i=1;i<=a && i<=b;i++){
            if(a%i ==0 & b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        int lcm=(a*b)/gcd;
        System.out.println(lcm);
    }
}

 */
//calculate the sum of digits in a string. The goal is to
//extract all numeric digits from a given string, add them, and
//return the total.
//Input:
//"abc123xyz45"
public class grandTest {
    public static void main(String[] args) {
       String s="abc123xyz45";

            int sum=0;
       for(int i=0;i<s.length();i++) {
           char c = s.charAt(i);
           if (Character.isDigit(c)) {
             sum=sum+Character.getNumericValue(c);
           }
       }
         // for(int i=0;i<a.length;i++){
            System.out.println(sum);
        //  }

    }
}