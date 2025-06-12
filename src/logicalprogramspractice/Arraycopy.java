package logicalprogramspractice;

public class Arraycopy {
    public static void main(String[] args) {
//        int[] a={1,3,5,8,1,1,5};
//        int b[]=new int[a.length];

//        for(int i=0;i<a.length;i++){
//            b[i]=a[i];
//        }
//
//        for(int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }

        //in rev
//        int index=0;
//        for(int i=a.length-1;i>=0;i--){
//            b[index]=a[i];
//            index++;
//        }
//
//        for(int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }

        //frequency of all elements in array
//       int visited=-1;
//        for(int i=0;i<a.length;i++){
//            int count=1;
//           for(int j=i+1;j<a.length;j++){
//               if(a[i]==a[j]){
//                   a[j]=-1;
//                   count++;
//               }
//           }
//           if(a[i]!=-1) {
//               System.out.println("frequency of " + a[i] + " is  " + count);
//           }

//           }

        //print duplicates of array
//        int[] a={1,3,5,8,1,1,5};
//        int b[]=new int[a.length];
//            int visited=-1;
//        for(int i=0;i<a.length;i++) {
//
//            int count = 0;
//            for (int j = i + 1; j < a.length; j++) {
//                count = 1;
//                if (a[i] == a[j]) {
//                    count++;
//                    a[j] = -1;
//                    break;
//                }
//            }
//            if (a[i] != -1 && count > 1) {
//                System.out.println(a[i]);
//            }
//
//        }

        int[] a={11,34,56,67,89,99};
       // for odds
//        for(int i=1;i<a.length;i=i+2){
//            System.out.println(a[i]);
//        }
        for(int i=0;i<a.length;i=i+2){
            System.out.println(a[i]);
        }

    }
}
