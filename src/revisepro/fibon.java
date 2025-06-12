package revisepro;

//fibo series without rec

public class fibon {
    public static void main(String[] args) {
        int a=0;int b=1;
        int n=5;
        System.out.print(a+ " "+b);
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
}

/*
class fibonacci{
    public static int  fibo(int n){
        int a=0;int b=1;
        if(n==0)
            return n;
        else if( n==1)
            return n;
        else
            return fibo(n-1)+fibo(n-2);
    }
}
public class fibon {
    public static void main(String[] args) {
        int n=7;//for 8th fibonacci as index starts from 0
        System.out.print("nth fibo is:"+fibonacci.fibo(n));
        System.out.println();
       for(int i=0;i<=n;i++){
           System.out.print(fibonacci.fibo(i)+" ");
       }

    }
}

 */