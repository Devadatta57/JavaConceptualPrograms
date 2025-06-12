package allconcptprograms;
//enhanced loops
public class loops {
    public static void main(String[] args) {
        int[] a={2,456,67};

        for(int ar:a){
            System.out.print(ar+" ");
        }
        //////////////////////
        int[][] b={
                { 1,3},{5,7}
        };
        System.out.println();

        for(int br[]:b){
            for(int brr:br){
                System.out.print(brr+" ");
            }
            System.out.println();
        }
        ///////////////////////
        System.out.println();
        int[][][] c={
                {
                        {1,23},{5,6}
                },
                {
                        {1,3,54},{5,3,7},{4,76,9}
                }
                  };

        for(int cr[][]:c){
            for(int crr[]:cr){
                for(int crrr:crr) {
                    System.out.print(crrr + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
