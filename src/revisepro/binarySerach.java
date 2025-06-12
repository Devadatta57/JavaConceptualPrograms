package revisepro;

class binary{
    public static  int bin(int[] a,int key){
        int low=0;int high= a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
}
public class binarySerach {
    public static void main(String[] args) {
        int a[]=new int[5];
        a=new int[]{12,34,56,78,79};
        int key=6;
       int res= binary.bin(a,key);
       System.out.println(res);

    }
}
