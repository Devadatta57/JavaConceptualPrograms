package allconcptprograms;

//strings

public class string {
    public static void main(String[] args) {
/*
    String s="govindaa";
    String s11="  govindaa  ";

    String s1=new String("govinda");
    String s2=new String("govinda");

    //System.out.println(s1.capacity());

    System.out.println(s==s1);//"==" checks ref
    System.out.println(s.equals(s1));//content

    System.out.println(s.charAt(2));
    System.out.println(s.indexOf('a'));
    System.out.println(s.lastIndexOf('a'));
    System.out.println(s.length());
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());
    System.out.println(s.substring(0,2));
    System.out.println(s11.trim());

 */




        /*
     String d=" ";//blankspace is not empty
     System.out.println(d.isEmpty());//blankspace is not empty
     System.out.println(d.isBlank());

     String e=" spgk ";
     //method chaining
    // int f=e.length().trim();finding out first length and then trimming gives error
     System.out.println(e.trim().length());//trimming the spaces in the string and finding length
         */
/*
        String fname = "deva";
        String gname = "datta ";
        String met=method(fname.concat(gname));//creates new string  doesnt affect old string-strings immutable
        System.out.println(met);

    }
    public static String method(String s){
        System.out.println(s.concat(" goodmorning"));//creates new string  doesnt return to s again
        return s;
    }

 */


        //stringbuilder

        /*


    StringBuilder sb=new StringBuilder("lakshmi");
    StringBuilder sb1=new StringBuilder("lakshmi");
    System.out.println(sb==sb1);//ref
    System.out.println(sb.equals(sb1));//ref

     //convert to string if you want to compare content
     System.out.println(sb.toString().equals(sb1.toString()));
     System.out.println(sb.append("govinda"));//wont create new string affects original
     System.out.println(sb.append(2));
     System.out.println(sb.append(5.3f));
     System.out.println(sb.insert(1,"krishna"));
     System.out.println(sb.insert(2,3.6f));
     System.out.println(sb.charAt(1));
     sb.setCharAt(1,'q');
     System.out.println(sb.delete(1,10));
     System.out.println(sb.deleteCharAt(0));
     System.out.println(sb.reverse());

     System.out.println(sb);
     System.out.println(sb.length());
     System.out.println(sb.capacity());//default+length=16+7
     StringBuilder sb11=new StringBuilder("asbhgfrtdeswqaxcy");
     System.out.println(sb11.capacity());
     sb11.ensureCapacity(45);
     System.out.println(sb11.capacity());

         */

        //stringbuffer

        StringBuffer sb=new StringBuffer("parvaty");
        StringBuffer sb1=new StringBuffer("parvaty");
        System.out.println(sb==sb1);//ref
        System.out.println(sb.equals(sb1));//ref

        //convert to string if you want to compare content
        System.out.println(sb.toString().equals(sb1.toString()));
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append("shiva"));
        System.out.println(sb.append(369));
        System.out.println(sb.insert(0,"shiva"));
        System.out.println(sb.equals(sb1));
        System.out.println(sb.charAt(2));
        System.out.println(sb.delete(12,17));
        System.out.println(sb.deleteCharAt(12));
        System.out.println(sb.reverse());
        sb.setCharAt(1,'w');
        System.out.println(sb);



    }
}
