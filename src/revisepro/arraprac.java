package revisepro;

public class arraprac {
    public static void main(String[] args) {
        int[] a = new int[5];
        a = new int[]{2, 2, 3, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int temp[] = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != a[i + 1]) {
                temp[index] = a[i];
                index++;
            }
        }
        temp[index]=a[a.length-1];
        index++;
        for(int i=0;i<index;i++){
            System.out.print(temp[i]+" ");
        }

    }
}
        //sorting
        /*
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

         */


