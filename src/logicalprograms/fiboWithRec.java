package logicalprograms;
// 0 1 1 2 3 5 8 (we have to print first not (second /next)
class fibona{
    public static void fibo(int position){
        int first=0,second=1;
        for(int i=0;i<position;i++){// (0<4)loop runs from (0 -position) times not from 0 -(pos+1)times( 0 to 5)
            System.out.println(first+ " ");
            int next  = first + second;
            first  = second;
            second = next;
        }
    }
    public static int Nfibo1(int position){
        if (position<=1){//0=0,1-1 base case
            return position;
        }
        int first=0,second=1,next=0;//F(0)-0,F(1)-1 user taken ,so F(2)=F(0)+F(1) so taken i=2 as we are calculating from  F(2)
        for(int i=2;i<=position;i++){// becoz it should return nth position value
            next  = first + second;//F(2)=F(0)+F(1)
            first  = second;
            second = next;
        }
        return first ;
    }
}
public class fiboWithRec {
    public static void main(String[] args) {
        fibona.fibo(5);
        System.out.println();
        System.out.print(fibona.Nfibo1(5));
    }
}
