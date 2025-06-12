package revisepro;

public class frequencyCount {
    public static void main(String[] args) {
        int[] a=new int[6];
        a=new int[]{2,4,67,9,9,4,67};
        int[] temp=new int[10];
           int visited=-1;
        for(int i=0;i<a.length;i++){
            int count=1;
             for(int j=i+1;j<a.length;j++){
                 if(a[i]==a[j]){
                     count++;
                 }

             }
             System.out.println(a[i]+" appeared "+count+" times ");
        }

    }
}
