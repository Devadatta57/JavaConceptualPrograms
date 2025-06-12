package allconcptprograms;


//super keyword with var
/*
class parent{
    String colour="white";
    void m1(){
        System.out.println(colour);
    }
}
class child1 extends parent{
    String colour="blue";
    void m1(){
        System.out.println("actually blue but super class colour white check it is "+super.colour);
    }
}
class child2 extends child1{
    String colour="red";
    void m1(){
        System.out.println("actually red but super class colour blue check it is "+super.colour);
    }
}
public class inheriwithsupe {
    public static void main(String[] args) {
     child1 c1=new child1();
     c1.m1();
     child2 c2=new child2();
     c2.m1();
    }
}
 */
/*
class parent{
    int a,b;
    parent(){
        System.out.println("parent class default constr");
    }
    parent(int a,int b){
        a=this.a;
        b=this.b;
        System.out.println("parent class parametri.... constr");
    }

}
class child1 extends parent{
    int a,b;
    child1(int a,int b){
        //super();by default by jvm
        this();//by  user
        this.a=a;
        this.b=b;
        System.out.println("child class parametri...  constr");
    }
    child1(){
        System.out.println("child class default constr");
    }
}
public class inheriwithsupe {
    public static void main(String[] args) {
      child1 c=new child1(34,567);
    }
    }
 */
//super with method
/*
class parent{

    void m1(){
       System.out.println("m1 method in parent");
    }
    void m2(){
        System.out.println("m2 method in parent");
    }
}
class child extends parent{
    void m1(){
        System.out.println("m1 method in child overided by parent");
    }
    void met(){
        super.m1();
        super.m2();
    }
}
public class inheriwithsupe {
    public static void main(String[] args) {
        child c1=new child();
        c1.m1();
        c1.met();
    }
    }
 */
//Static methods in Java are not associated with instances of a class but with the class itself. Hence, they cannot be overridden, but they can be re-declared (hidden) in a subclass.
/*
class parent{
   static int a=7;
   static  int b=3;
   static void m1(){
       System.out.println("m1 static method in parent ");
   }
}
class child extends parent{
    static
    {
        a = 34;
    }
    static void m1(){
        // This method is not overriding but hiding the static method from Parent class
        System.out.println("m1 static method in child "+a);
    }
}
public class inheriwithsupe {
    public static void main(String[] args) {
        child c1=new child();
        c1.m1();
    }
    }
 */
//For Constructors: Use super(arguments) to call a parent class constructor.
//For Methods/Fields: Use super.methodName() or super.fieldName to access parent class methods or fields when overridden or hidden in the child class.
//this: with var
/*
class parent{
    int a;
    int b;
    public void m1(int a,int b){
     this.a=a;//this.a = a; ensures that the value of the local variable a (parameter) is assigned to the instance variable a of the class.
         // Without this, the assignment would be ambiguous, and the compiler would assume the local variable refers to itself.
     this.b=b;
     System.out.println(a+" "+b);
    }
}
class child extends parent{
    public void m1(){
      super.m1(34,67);
    }

}
public class inheriwithsupe {
    public static void main(String[] args) {
      child c=new child();
      c.m1();
    }
    }
 */
//this: to invoke current class instance method
/*
class parent{
    int a;
    int b;
    public void m1(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+" "+b);
    }
}
class child extends parent{
    public void m1(){
       this.m2();//this.m2 or m2() -same
    }
    public void m2(){
        System.out.println("m2");
    }

}
public class inheriwithsupe {
    public static void main(String[] args) {
        child c=new child();
        c.m1();
    }
}
 */

class parentt{
    int a;
    int b;
   parentt(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("parent  parametrized  "+a+" "+b);
    }
    parentt(){
       //calling paramtrized of same calss
       this(56,78);
        System.out.println("parent default");

    }
}
class chilld extends parentt{
    chilld(){
        System.out.println("child class default constr");
    }
     chilld(int a,int b){
        //super()
        this();
         System.out.println(a+" "+b+" child class parametr");
     }
}
public class inheriwithsupe {
    public static void main(String[] args) {
        chilld c=new chilld(45,78);

    }
}
