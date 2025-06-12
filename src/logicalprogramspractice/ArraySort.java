package logicalprogramspractice;

public class ArraySort {
    public static void main(String[] args) {
        int a[]={12,45,67,89,56,11};
        //in ascending
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i]>a[j]){
//                    int temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

        //in descending
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
