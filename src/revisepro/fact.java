package revisepro;
//fact without recursion
/*
public class fact {
    public static void main(String[] args) {
        int n=5;int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
 */
//fact with recursion
class factorial{
    public  static int facto(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*facto(n-1);

    }
}
public class fact {
    public static void main(String[] args) {
        int n=6;
        System.out.println(factorial.facto(n));

    }
}