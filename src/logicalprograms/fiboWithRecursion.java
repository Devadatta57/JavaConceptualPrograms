package logicalprograms;
import java.util.Scanner;
//index- 0 1 2 3 4 5 6 7(index-3 returns position 4 value i.e (2) as count starts from 0)
       //0 1 1 2 3 5 8 -(0 based indexing as(0+1=1),(1+1=1) series starts from 0 so here

//index- 0 1 2 3 4 5 6 7(index-3 returns 3 as count starts from 1)
       //1 1 2 3 5 8 13-(1- based indexing as(1+1=2),(1+2=3) series starts from 1
class Fibo{
      public  static int fibo(int position){
          if(position<=1)
              return position;
          else
              return fibo(position-1)+fibo(position-2);

      }
}
public class fiboWithRecursion {
    public static void main(String[] args) {
        System.out.println("Enter position of the series: ");
        Scanner sc=new Scanner(System.in);
        int position=sc.nextInt();
        while(position<0){
            System.out.println("negative number enter again");
            position=sc.nextInt();
        }
        int result=Fibo.fibo(position);
        System.out.println(result);

    }
}
