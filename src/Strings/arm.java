package Strings;

public class arm {
    public static void main(String[] args) {
        int a=3;
        int b=10;
        primeInLimits(a,b);
    }

        public static void primeInLimits(int low, int high) {
            for(int i=low; i <= high; i++){
                boolean isPrime=true;
                for(int j=2;j <= i/2;j++){
                    if(i%j == 0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(i);
                }
            }
        }
}
