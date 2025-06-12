package Arrays;

class Merge{
    public static int[] merge(int a[],int b[]){
        int length=a.length+b.length;
        int[] temp=new int[length];
        int index=0;
        for(int i=0;i<a.length;i++){
            temp[index]=a[i];
            index++;
        }
        System.out.println();

        for(int j=0;j<b.length;j++){
            temp[index]=b[j];
            index++;
        }
        System.out.println();

       // for(int k=0;k<temp.length;k++){
       //     System.out.print(temp[k]+" ");
       // }
        return temp;
    }
}
public class mergeSort {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3};
        int[] b=new int[]{4,5,6};
        int c[]= Merge.merge(a,b);

          for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
          }

    }
}
