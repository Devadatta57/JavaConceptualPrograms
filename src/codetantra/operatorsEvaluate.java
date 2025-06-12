package codetantra;

public class operatorsEvaluate {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        a += (a *= b) - (b += 2);//a=a+((a=a*b)-(b=b+2)//*,-,+ order
        System.out.println(a+" a "+" b "+b);

        int a1 = 5;
        int b1 = 3;
        int result = --a1 + ++b1 - a1++ + b1--;//order-unary operators(--,++)//(pre)(--a,++b)//post(a++,b--)
    }
}
