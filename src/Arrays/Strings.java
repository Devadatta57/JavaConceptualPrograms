package Arrays;
//.How do you check if a String contains a particular sequence of characters (“Hello,
//welcome to Codegnan!”).
/*
public class Strings {
    public static void main(String[] args) {
        String str="Hello,this is codegnan";
        System.out.println(str.contains("Hello"));
    }
}

 */
// How do you replace all occurrences of a character in a String(“1234-5678-9012
//3456”) with another character(replace 5 with x).
/*
public class Strings {
    public static void main(String[] args) {
        String str="1234-5678-90123456";
        System.out.println(str.replace('5','x'));
    }
}
 */
//How do you split a String into an array of substrings based on a delimiter (“ , ”).
/*
public class Strings {
    public static void main(String[] args) {
        String str="1234 ,56789,0123456";
        String[] s=str.split(",");
        for(String array:s){
            System.out.println(array+" ");
        }
    }
}
 */
// How can we remove a specific character from a String?
/*
public class Strings {
    public static void main(String[] args) {
        String str="Codegnan";
            System.out.println(str.replace("C",""));

    }
}
 */
// Write a program to calculate the total number of characters in the String without counting
//the spaces or special characters(“Codegnan Destination”)?
/*
public class Strings {
    public static void main(String[] args) {
        String str="Deva datta9898*&";
        str=str.replace(" ","");
        System.out.println(str);
        int count=0;
        for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
             if((ch>='a' && ch<='z')  || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')//write digits in '' becoz char datatype
              count++;
        }
        System.out.println(count);

    }
}
 */
public class Strings {
    public static void main(String[] args) {
        String str="Codegnan It solutions";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
          //  System.out.println(arr[i]);
            String rev="";
            String word=arr[i];
            for(int j=arr[i].length()-1;j>=0;j--){
                rev=rev+word.charAt(j);
            }
            System.out.print(rev+" ");

        }
    }
    }