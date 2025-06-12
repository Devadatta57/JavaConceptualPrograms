package Arrays;
//.Given an array of integers, find the frequency of each unique element without using any other
//collections. For example, in [2, 3, 3, 2, 5], the output should display each unique element and its
//frequency.
/*
public class frequency {
    public static void main(String[] args) {
        int[] a=new int[5];
        a= new int[]{2, 3, 3, 2, 5};

        int[] digit=new int[10];

        for(int i=0;i<a.length;i++){
            int count=1;
            if(a[i]!=-1){
                for(int j=i+1;j<a.length;j++){

                    if(a[j]!=-1 && a[i]!=-1){
                        if(a[i]==a[j]) {
                            a[j] = -1;
                            count++;
                        }

                    }
                }
            }
            if(a[i]!=-1)
            System.out.println(a[i]+" "+count);

        }
    }
}
 */
public class frequency {
    public static void main(String[] args) {
        int[] a = {2, 3, 3, 2, 5,6,8,7};
        boolean[] visited = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            if (visited[i] != true) {
                for (int j = i + 1; j < a.length; j++) {
                      if(a[i]==a[j]){
                          count++;
                          visited[j]=true;
                      }
                }
                System.out.println(a[i]+" : "+count);

            }


        }
    }
}