package patterns;

public class apple {
    public static void main(String[] args) {
        int n=16;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( (i==5 && j>=3 && j<=5) || (i==5 && j>=(n/2)+1 && j<=12) || (i==6 && j>=6 && j<=(n)/2) || (j==2 && i>=6 && i<=9) || (i==10 && j>=3 && j<=11) || (i==6 && j>=10 && j<11) ||(j==9 && i>=7 && i<=8) || (i==9 && j>=10 && j<=10) || (i==4 && j>=6 && j<=7) || (i==3 && j>=8 && j<9) || (i==2 && j>=7 && j<=8) || (i==3 && j>=6 && j<7) ){
                    System.out.print("* ");
                }else{
                   System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
