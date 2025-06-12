package revisepro;

class linea{
    public static int lin(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(key==a[i])
               return i;
        }
        return -1;
    }
}
public class linear {
    public static void main(String[] args) {
        int[] a=new int[5];
        a=new int[]{45,34,23,78};
        int key=4;
     int res= linea.lin(a,key);
     System.out.println(res);
    }
}
