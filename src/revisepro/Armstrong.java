package revisepro;
//1cube+5cube+3cube
public class Armstrong {
    public static void main(String[] args) {
        int n=1634;
        int ori=n;
        int length=(n+"").length();
        //System.out.println(length);
        int sum=0;
        while(n>0){
          int rem=n%10;
          int  pow= (int)Math.pow(rem,length);
       //   System.out.println(pow);
          sum=sum+pow;
          n=n/10;
        }
        System.out.println(sum);
        if(sum==ori){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }



    }
}
