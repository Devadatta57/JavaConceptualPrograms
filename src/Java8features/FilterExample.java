package Java8features;

interface FilterInter{
 public boolean filter(int x);
}
class FilterArray{
    public static void filterarray(int arr[],FilterInter obj){
        for(int a:arr){
            if(obj.filter(a)){
                System.out.print(a+" ");
            }
        }

    }
}
public class FilterExample {
    public static void main(String[] args) {
        int arr[]={12,45,67,234,56,5232,156,89,23,231,3,7};
        FilterArray.filterarray(arr,(value)->{return value%3==0;});
        System.out.println();
        FilterArray.filterarray(arr,(value)->{return value%5==0;});
    }
}
