package COntrolstate;

public class UniqLettUsingIndexOf {
    public static void main(String[] args) {
        String str="devadatta";
        for(int i=0;i<str.length()-1;i++){
            char currentChar= str.charAt(i);
            if(str.indexOf(currentChar)==str.lastIndexOf(currentChar))
                System.out.println("unique letter is: "+currentChar);
        }

    }
}


