package logicalprograms;
import java.util.Scanner;
class uniqueCount{
    public static int uniqcount(int number){
        int dig[]=new int[10];
        int rem=0;
        while(number>0){//112233
             rem=number%10;//332211
             dig[rem]++;
             number=number/10;
        }
        int count=0;
        for(int i=0;i<dig.length;i++){
            if(dig[i]>0)
                count++;
        }
      return count;
    }
    public static void uniqdigprint(int number) {
        int dig[] = new int[10];
        int rem = 0;
        while (number > 0) {//112233
            rem = number % 10;//332211
            dig[rem]++;
            number = number / 10;
        }

        for (int i = 0; i < dig.length; i++) {
            if (dig[i] > 0)
                System.out.println("unique dig in a number "+i);
        }
        System.out.println();
    }

        public static int nonrepeateddigcount(int number){
            int[] dig= new int[10];
            int rem=0;
            while(number>0){
                rem=number%10;
                dig[rem]++;
                number=number/10;
            }
            int count=0;
            for(int i=0;i<dig.length;i++){
                if(dig[i]==1)
                    count++;
            }
            return count;
            }

    public static void nonrepeateddigprint(int number){
        int[] dig= new int[10];
        int rem=0;
        while(number>0){
            rem=number%10;
            dig[rem]++;
            number=number/10;
        }
        int count=0;
        for(int i=0;i<dig.length;i++){
            if(dig[i]==1)
               System.out.println("non repeated number is "+i+" ");
        }
    }

}
public class UniqueDigCountinNum {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number: ");
       int number=sc.nextInt();
       System.out.println("unique number count in a number "+uniqueCount.uniqcount(number));
        uniqueCount.uniqdigprint(number);
        System.out.println("non-repeated number count "+uniqueCount.nonrepeateddigcount(number));
        uniqueCount.nonrepeateddigprint(number);
    }
}
