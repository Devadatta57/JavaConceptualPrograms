package logicalprograms;

class ArrayOper{
    public static int min(int[] a){
        int min=a[0];
      for(int i=1;i<a.length;i++){
          if(min>a[i])
              min=a[i];
      }
      return min;
    }
    public static int max(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        return max;
    }
    public static int sum(int a[]){
        int sum=0;
        for(int i=1;i<a.length;i++){
           sum=sum+a[i];
        }
        return sum;
    }
    public static int avg(int a[]){
        int length=a.length;
        int sum=0,avg=0;
        for(int i=1;i<a.length;i++){
            sum=sum+a[i];
            avg=(sum)/length;
        }
        return avg;
    }
}
public class ArrayMinMaxSumAvg {
    public static void main(String[] args) {
        int[] a={23,5,45,787};
        System.out.println("min "+ArrayOper.min(a));
        System.out.println("max "+ArrayOper.max(a));
        System.out.println("sum "+ArrayOper.sum(a));
        System.out.println("avg "+ArrayOper.avg(a));
    }
}
