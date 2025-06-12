package allconcptprograms;

//string-length()
//array-length
public class stringprograms {
    public static void main(String[] args) {
        /*
        //printing through loop
         String str="roadsidefood";
         for(int i=0;i<=str.length()-1;i++){
             System.out.print(str.charAt(i)+" ");
         }

         */

        //copy string

        /*
        String str="roadsidefood";
        String str2="";
        for(int i=0;i<str.length();i++){
            str2=str2+str.charAt(i);
        }
        System.out.print(str2);

         */

        //reverse a string
        /*
        String str="reverseastring";
        String str2="";
        for(int i=str.length()-1;i>0;i--){
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);
         */
        //reverse a word in a string
        /*
      String s1="deva datta hello";
      String[] s2=s1.split(" ");//1,2,3

      for(int i=s2.length-1;i>=0;i--){//for string length is property not function
          System.out.println(s2[i]);
      }

         */
        //reverse a word sequence in a string
        /*
        String s1="lakshmi govinda shiva parvaty";
        String[] s2=s1.split(" ");

        for(String s:s2){
          //  System.out.println(s);//flying
            char a[]=s.toCharArray();
            for(int i=a.length-1;i>=0;i--) {//string/char -length property
                System.out.print(a[i]);
            }
            System.out.print(" ");
        }
         */
        //reverse a word sequence in a string
        /*
        String s1="lakshmi govinda shiva parvaty";
        String[] s2=s1.split(" ");
        String s3="";
        for(String s:s2){//lakshmi-7
            for(int i=s.length()-1;i>=0;i--) {
                System.out.print( s.charAt(i));//s(6)

            }
            System.out.print(" ");

        }
         */
        /*
            //lower to upper
        String s1="flying";
        for(int i=0;i<s1.length();i++){
            System.out.print(((char)((int)(s1.charAt(i))-32)));
        }
         */

        /*
        //upper to lower
        String s2="BEAST";
        for(int i=0;i<s2.length();i++){
            System.out.print((char)((int)(s2.charAt(i))+32));
        }
         */

        //upper to lower

        /*
        String s2="BEAST";
        String  a="";
        for(int i=0;i<s2.length();i++){
            a = a + (char)(((s2.charAt(i))+32));
        }
        System.out.println("outer " +a);
         */

        //capital to small-small to capital
        /*
        String str="iNeUrON";
        String s=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z') {//capital
                 s=s+(char)((int)(str.charAt(i))-32);
                 //System.out.print(s);
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {//
             //else{
                s=s+(char)((int)(str.charAt(i))+32);
              //  System.out.print(s);
            }
            }
            System.out.print(s+" outer");

         */

        /*
       //palindrome
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2="";
        for(int i=str.length()-1;i>=0;i--){
           str2=str2 + str.charAt(i);
        }
        System.out.println(str2);
        if(str.equals(str2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
         */

        //anagram
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word 1:");
        String s1=sc.nextLine();
        System.out.println("enter the word 2:");
        String s2=sc.nextLine();


      String  v1=s1.replace( " ","").toLowerCase();
      String  v2=s2.replace(" ","").toLowerCase();

       char[] c1=v1.toCharArray();
       char[] c2=v2.toCharArray();

          Arrays.sort(c1);
          Arrays.sort(c2);

        String w1="";
        String w2="";
        for(int i=0;i<c1.length;i++){
            w1=w1+c1[i];
        }

        System.out.println(w1);
        //converting into string and checking equal/not
        for(int i=0;i<c2.length;i++){
           w2=w2+c2[i];
        }

        System.out.println(w2);

        if(w1.equals(w2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }

         */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word 1:");
        String s1=sc.nextLine();
        System.out.println("enter the word 2:");
        String s2=sc.nextLine();


        String  v1=s1.replace( " ","").toLowerCase();
        String  v2=s2.replace(" ","").toLowerCase();

        char[] c1=v1.toCharArray();
        char[] c2=v2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

         */
        //checking with char array wheter both are equal /not
/*
      if(Arrays.equals(c1,c2)){
          System.out.println("anagram");
      }else{
          System.out.println("not anagram");
      }

 */ //without using char sort
        /*
     boolean flag=true;
     if(c1.length!=c2.length){
         System.out.println("not anagram");
     }
     if(c1.length==c2.length){//df,dm
         for(int i=0;i<c1.length;i++){//d
             System.out.println(c1[i]);
             for(int j=0;j<c2.length;j++){//d,m
                 System.out.println(c2[j]);
                 if(c1[i]==c2[j]){//d==d
                     i++;//f
                     j++;//m
                     break;//ctrl moves to outer loop
                 }else{
                      flag=false;
                      break;
                 }
             }
         }
     }

         if(flag) {
             System.out.println("anagram");
         }
         else{
             System.out.println("not anagram");
         }

         */

        //pangram
        /*
         String s1="the quick brown fox jumps over the lazy dog";
         char[] c1=s1.replace(" ","").toCharArray();
         for(int i=0;i<c1.length;i++){
             System.out.print(c1[i]+" ");
         }
         int[] a=new int[26];

         for(int i=0;i<c1.length;i++){
             int index=c1[i]-'a';
             a[index]++;
         }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();

        boolean flag=true;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) {
                flag = false;
                System.out.println("not pangram");
                break;
            }
        }

        if(flag==true){
            System.out.println("pangram");
        }

         */
        String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        char[] c1=s1.replace(" ","").toCharArray();
        for(int i=0;i<c1.length;i++){
            System.out.print(c1[i]+" ");
        }
        int[] a=new int[26];

        for(int i=0;i<c1.length;i++){
            int index=c1[i]-'A';
            a[index]++;
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();

        boolean flag=true;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) {
                flag = false;
                System.out.println("not pangram");
                break;
            }
        }

        if(flag==true){
            System.out.println("pangram");
        }

    }
}

