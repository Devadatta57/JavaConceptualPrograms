package Java8features;
////class Calculator{
//	public int Addition(int a,int b) {
//		return a+b;
//	}
//	
//	public int Subtraction(int a,int b) {
//		return a-b;
//	}
//	
//	public int Multiplication(int a,int b) {
//		return a*b;
//	}
//	
//	public int division(int a,int b) {
//		return a/b;
//	}
//}
//public class ArithmeticExample {
//	public static void main(String[] args) {
//          Calculator c= new Calculator();
//          int res1=c.Addition(1, 4);
//          int res2=c.Subtraction(3, 1);
//          int res3=c.Multiplication(1, 3);
//          int res4=c.division(5, 2);
//          
//          
//          System.out.println(res1);
//          System.out.println(res2);
//          System.out.println(res3);
//          System.out.println(res4);
//	}
//}

//with interface no lamda and higher order function
//interface Arithmetic{
//	int doOperation(int a,int b);
//}
//
//class Add implements Arithmetic{
//	public int doOperation(int a, int b) {
//		return a+b;
//	}
//}
//
//class Sub implements Arithmetic{
//	public int doOperation(int a,int b) {
//		return a-b;
//	}
//}
//
//class Multi implements Arithmetic{
//	public int doOperation(int a,int b) {
//		return a*b;
//	}
//}
//public class ArithmeticExample {
//	public static void main(String[] args) {
//		Arithmetic o;
//		o=new Add();
//		int res1=o.doOperation(1,3);
//		
//		o=new Sub();
//		int res2=o.doOperation(3,45);
//		
//		o= new Multi();
//		int res3=o.doOperation(14,4);
//		
//		System.out.println(res1);
//		System.out.println(res2);
//		System.out.println(res3);
//	}
//}

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
