package revisepro;

class merge{
    public  static  void mer(int[] a,int[] b){
        int c[]=new int[a.length+b.length];
        int index=0;

        for(int i=0;i<a.length;i++){
            c[index]=a[i];
            index++;
        }
        for(int j=0;j<b.length;j++){
            c[index]=b[j];
            index++;
        }

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
public class arraycopying {
    public static void main(String[] args) {
        int[] a=new int[6];
        a=new int[]{2,4,67,9};
        int[] b=new int[3];
        b=new int[]{12,34,56};

           merge.mer(a,b);

        /*//copying a to b
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
          System.out.print(b[i]+" ");
        }
         */

    }
}
