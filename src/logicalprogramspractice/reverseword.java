package logicalprogramspractice;

public class reverseword {
    public static void main(String[] args) {
        String sentence="Codegnan it solutions";
        String[] str=sentence.split(" ");
        String rev="";
        for(int i=0;i<str.length;i++){
            String word=str[i];
            for(int j=str[i].length()-1;j>=0;j--){
               rev=rev+word.charAt(j);
            }
            rev=rev+" ";

        }
        System.out.println(rev);

    }
}
