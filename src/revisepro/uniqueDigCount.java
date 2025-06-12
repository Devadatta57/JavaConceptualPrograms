package revisepro;

public class uniqueDigCount {
    public static void main(String[] args) {
        int n=1122333;
        int[]  dig =new int[10];
      //  int len=(a+"").length();
       while(n>0){
           int rem=n%10;
           dig[rem]++;
           n=n/10;
       }
       int count=0;
     for(int i=0;i<dig.length;i++){
         if(dig[i]>0){
             count++;
             System.out.println(i+ " reapeated elements count "+dig[i]);//prints count
           //  System.out.println(i+" ");
         }
     }
        System.out.println(count+" count of digits");

    }
}
