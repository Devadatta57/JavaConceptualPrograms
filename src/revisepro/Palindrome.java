package revisepro;

public class Palindrome {
    public static void main(String[] args) {
        int n=126;int ori=n;int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==ori)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

    }
}
