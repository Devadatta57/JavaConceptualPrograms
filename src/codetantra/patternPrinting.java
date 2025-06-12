package codetantra;

/*
4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1
4 4 4 3 3 3 2 2 2 1 1 1
4 4 3 3 2 2 1 1
4 3 2 1
 */
public class patternPrinting {
    public static void main(String[] args) {
        for(int i=4;i>=1;i--){//for rows iterating
            for(int j=4;j>=1;j--){//for columns iteraating from 4-1
                for(int k=0;k<i;k++){//for printing j(4,3,2,1) i times(as rows number)
                    System.out.print(j+" ");//print j
                }
            }
            System.out.println();//print j
        }
    }
}
