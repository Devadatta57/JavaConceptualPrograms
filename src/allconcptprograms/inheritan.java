package allconcptprograms;


/*
class Parent{
    int a;
    void met(){
       System.out.println("parent class");
    }
}
class child extends Parent{
    int b;
    {
        a=7;
    }
    //overriding
   // void met(){
     //   System.out.println("child constr");
   // }
}
class inheritan {
    public static void main(String[] args) {
             child c=new child();
             c.b=56;

             System.out.println(c.a);
             System.out.println(c.b);
             c.met();

    }
}
 */
/*
class Parent{
    int a=3;
    void dis(){
        System.out.println("parent "+a);
    }
}
class child extends Parent{
    int a=5;
    //overriding dis()
    void dis(){
        System.out.println("child "+a);
    }
}
class inheritan {
    public static void main(String[] args) {
        child c=new child();
        c.dis();
    }
    }

 */
//multi-level
/*
class Parent{
    int a;
    void p(){
        System.out.println("parent class "+a);
    }
}
class child1 extends Parent{
    int b;
    {
        //created obj so includes non-static block in child1 class
        a=34;
        b=8;
    }
    void p1(){
        System.out.println("child class1 "+a+" "+b);
    }
}
class child2 extends child1{
    int c;

    {
        //created obj so includes non-static block in child2 class
        a=45;
        b=12;
        c=11;
    }

        void p2(){
            System.out.println("child class2 "+a+" "+b+" "+c);
        }

}
class inheritan {
    public static void main(String[] args) {

        child2 c=new child2();
        c.p();//45
        c.p1();//45 12
        c.p2();//45 12 11


        child1 d=new child1();//created obj so includes non-static block in child1 class
        d.p();
        d.p1();
       // d.p2();not accessible

    }
    }
 */

/*
class Parent{
    int a;
    static{
        System.out.println("static in parent");
    }
    static  void oi(){
        System.out.println("static met in parent");
    }
    void p(){
        System.out.println("parent class "+a);
    }
}
class child1 extends Parent{
    int b;
    static {
        System.out.println("static in child1");
    }
    static void oi(){
        System.out.println("static method  in child1");
    }
    //values also overrided from par-child in non static block
    {
        //created obj so includes non-static block in child1 class
        a=34;
        b=8;
    }
    //overrided
    void p(){
        System.out.println("child class1 "+a+" "+b);
    }
}
class child2 extends child1{
   static  int c;
    static{
        c=888;
        System.out.println("static in child2");
    }
    static void oi(){
        System.out.println("static method in child2");
    }
 //values also overrided from parent-child1-child2 in non static block
    {
        //created obj so includes non-static block in child2 class
        a=45;
        b=12;
        c++;
    }

    void p(){
        System.out.println("child class2 "+a+" "+b+" "+c);
    }

}
class inheritan{
    public static void main(String[] args) {//static var,static meblock
        child2 c=new child2();
        c.p();//45
        //child2.oi();
        c.oi();

        child1 i=new child1();
        i.p();
        i.oi();

    }
}

 */


/////////////////////////////////////////////////////////////////////////
//non-static block executed every time obj created irrespective of constr created in the class,if constr created then first line executed is non-static block then comes next constr code
/*
class Demo {
    // Non-static block
    {
        System.out.println("Non-static block executed.");
    }

    // Constructor
}

public class inheritan {
    public static void main(String[] args) {
        // Creating first object
        Demo obj1 = new Demo();

        // Creating second object
        Demo obj2 = new Demo();
    }
}
 */
//////////////////////////////////////////////////////////////////////////////////////
//there is an execution of static blocks in every parent and child class in parent-child order but no inheritance of static blocks
/*
class Parent{
    int a;
    static int b;
    //static met()
   // No Inheritance of Static Blocks:Static blocks are not inherited by subclasses. Each class in the hierarchy has its own static blocks that are executed independently.
    static{
        b++;
        System.out.println("static block in parent called "+b);
    }
}
class child1 extends Parent{
    static int c;
    //non-static block
    {
        System.out.println("non-static block called in child1 when  child1 obj created");//1 1 67
        a++;
        c++;
    }
}
class child2 extends Parent{
    int d;
    {
        System.out.println("non-static block called in child2 when child2 obj  but static block value b not inherited  so b=0");//1 1 67
        d=67;
        System.out.println(a+" "+b+" "+d);//1 1 67
        //'c' we cant access as child2 inherited from parent not from child1
    }
}
public class inheritan {
    public static void main(String[] args) {//static var-->static block
        child2 c2=new child2();//static var-->static block-->static met
    }
    }
 */
/*
class Parent{
    int a;
    static int b;
    void met(){
        System.out.println("parent method");
    }
}
class child1 extends Parent{
    static int c;
    void met(){
        System.out.println("child1 method");
    }
}
class child2 extends Parent{
    int d;
    void met(){
        System.out.println("child2 method");
    }
}
public class inheritan {
    public static void main(String[] args) {//static var-->static block
        child2 c2=new child2();//static var-->static block-->static met
        c2.met();
        child1 c1=new child1();
        c1.met();
    }
}
 */
/*
class Parent{
    int a=23;
    void met(){
        System.out.println("parent child");
    }
}
class child1 extends Parent{
    void met(){
        System.out.println("child1 inherited from parent ");
    }
}
class child2 extends Parent{
    void met(){
        System.out.println("child2 inherited from parent");
    }
}
class child3 extends child1{
    void met(){
        System.out.println("child3 inherited from child1");
    }
}
public class inheritan{
    public static void main(String[] args) {
        child2 c2=new child2();
        c2.met();

        child3 c3=new child3();
        c3.met();
    }
}
 */
//static blocks inherited but not overided,methods are inherited but not overided treated as new static methods  in everychild class hiding parent class method
/*
class Parent{
    static int a=7;
    static int b=8;
   // static{
    //    a=1;
    //    b=2;
    //    System.out.println("static block in parent "+a+" "+b);
    //}
    static void met(){
         System.out.println("static method in parent");
    }
}
class child1 extends Parent{
    static int c=12;
    static int d=89;
   // static{
     //   c=55;
      //  d=99;
      //  System.out.println("static block in  parent "+a+" "+b+" "+c+" "+d);
   // }
   //If you attempt to override a static method, Java will treat it as a new static method in the child class, hiding the parent’s method.
    static void met(){
        System.out.println("static method in child1 not overided  a"+a+" "+"b "+b+" "+"c "+c+" "+"d "+d);
    }
}
class child2 extends Parent{
    static int e=88;
    static int f=5;

   // static{
    //  e=9;
     // f=1;
      //a=6;
      //  System.out.println("static block in child2 "+a+" "+b+" "+e+" "+f);
    //}
    //If you attempt to override a static method, Java will treat it as a new static method in the child class, hiding the parent’s method.
    static void met(){
        System.out.println("static method in child2 not overided a "+a+" "+"b "+b+" "+"e "+e+" "+"f "+f);
    }
}
public class inheritan {
    public static void main(String[] args) {
      child2 c=new child2();
      c.met();
      child1 v=new child1();
      v.met();
    }
    }
 */
/*
class Parent{
    public void m1(){

    }
}
class child{
    public void m1(){

    }
}
class child2 extends Parent,child{

}
public class inheritan {
    public static void main(String[] args) {
      child2 c=new child2();
      c.m1();//which m1() to call whether from parent/child it confuses so not allowed
    }
    }
 */
//private cant be accessed as it violtes encapsulation propertuy
/*
class parent{
    private int a;
    private int b;
}
class child extends parent{
    {
      //  a=56;
    }
}
public class inheritan {
    public static void main(String[] args) {

    }
    }
 */
//constrs wont participate in inheritance
/*
class parent{
    parent(){
        System.out.println("parent class construc");
    }
}
class child extends parent{
   //super() in default child constr executes parent class constr
}
public class inheritance {
    public static void main(String[] args) {
      child c=new child();
    }
    }
 */

/*
class parent{
    int a;
    int b;
   parent(){
       System.out.println("parent class default constr");
   }
   parent(int a,int b){
       this.a=a;
       this.b=b;
       System.out.println("parent class parametrized constr"+a +" "+b);
   }
}
class child extends parent{
    int p;
    int q;
    child(){
        //super() by default included
        super(45,67);
        System.out.println("child class default constr");
    }
    child(int a,int b){
        super();
        this.p=a;
        this.q=b;
        System.out.println("child class parametrized constr"+a +" "+b);
    }
}
public class inheritan {
    public static void main(String[] args) {
        child c=new child(56,78);
    }
    }
 */
//recursive constr invocation not possible

class parent{

}
class child extends parent{
    int a,b;
    child(int a,int b){
       // this();//calling child()
        System.out.println("child parame...");
    }
    child(){
      this(23,67);//calling child(34,65);
        System.out.println("child constr...");
    }
}
public class inheritan {
    public static void main(String[] args) {

    }
    }

