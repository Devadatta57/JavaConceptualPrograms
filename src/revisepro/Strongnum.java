package revisepro;

public class Strongnum {
    public static void main(String[] args) {
        int n = 15;
        int ori = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + fact(rem);
            n=n/10;
        }

       if(sum==ori)
           System.out.println("strong number");
       else
           System.out.println("not strong number");
    }


    public static int fact(int rem) {
        int fact = 1;
        for (int i = 1; i <= rem; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
