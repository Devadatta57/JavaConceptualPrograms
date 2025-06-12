package calciproject;
import java.util.Scanner;

//abstract methods in abstract classes nso that every class can implement according to their requirement
abstract class info{
    abstract void input();
    abstract void compute();
    abstract void display();
}
class rectangle extends info{
    float side;
    float res;
    void input(){
        System.out.println("enter side of rect");
        Scanner sc=new Scanner(System.in);
        side=sc.nextFloat();
    }
    void compute(){
        res=side*side;
    }
    void display(){
        System.out.println(res);
    }
}
class square extends info{
    float side;
    float res;
    void input(){
        System.out.println("enter side of square");
        Scanner sc=new Scanner(System.in);
        side=sc.nextFloat();
    }
    void compute(){
      res=4*side;
    }
    void display(){
        System.out.println(res);
    }
}
class triangle extends info{
    float base,height,res;
    void input(){
        System.out.println("enter base of triangle");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        System.out.println("enter height of rect");
        height=sc.nextFloat();
    }
    void compute(){
      res=(0.5f)*base*height;
    }
    void display(){
        System.out.println(res);
    }
}
class circle extends info{
    float radius,res;
    void input(){
        System.out.println("enter radius of circle");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextFloat();
    }

    void compute(){
      res=(3.14f)*radius*radius;
    }
    void display(){
     System.out.println(res);
    }
}
class commonclass{
    //runtime poly
    void method(info in){
        in.input();
        in.compute();
        in.display();
    }
}
public class calculator {
    public static void main(String[] args) {
    rectangle r=new rectangle();
    square    s=new square();
    triangle  t=new triangle();
    circle    c=new circle();
    commonclass cm=new commonclass();
    //cm.method(r);
    //cm.method(s);
      //  cm.method(t);
        cm.method(c);

    }
}
