package logicalprogramspractice;

public class ArrayMax {
    public static void main(String[] args) {
        int[] a={12,45,67,1,3};
//        int max=12;
//        for(int i=0;i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
//        System.out.println(max);

        int min=12;
       for(int i=0;i<a.length;i++){
            if(a[i]<min){
              min=a[i];
           }
       }
        System.out.println(min);

    }
}
