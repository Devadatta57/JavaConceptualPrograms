package Java8features;

interface Arithmetic{
    public int Operations(int a,int b);
}
class ArithmeticOperations{
    public static int doOperations(int a,int b,Arithmetic obj){
        return obj.Operations(a,b);
    }
}
public class ArithmeticExample {
    public static void main(String[] args) {
       int result= ArithmeticOperations.doOperations(10,20,(a,b)->{return a+b;});
       System.out.println(result);
       int result2=ArithmeticOperations.doOperations(20,50,(a,b)->{return a-b;});
        System.out.println(result);

    }
}
