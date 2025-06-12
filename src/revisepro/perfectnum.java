package revisepro;
//perfect number
public class perfectnum {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum=sum+i;
        }
        if(sum==n)
            System.out.println("perefect");
        else
            System.out.println("not perfect");

    }
}
