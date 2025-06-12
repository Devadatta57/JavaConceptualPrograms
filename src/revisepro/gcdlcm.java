package revisepro;

public class gcdlcm {
    public static void main(String[] args) {
        int x=8;int y=6;
        int gcd=0;
        for(int i=1;i<=x && i<=y;i++){
            if(x%i ==0 && y% i==0)
                gcd=i;
        }
        System.out.println(gcd);
        System.out.println("lcm 3"+(x*y)/gcd);
    }
}
