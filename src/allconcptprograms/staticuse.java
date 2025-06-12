package allconcptprograms;

/*
class astat{
    int a=1;
    static int b=2;
}
public class staticuse {
    public static void main(String[] args) {
        astat at=new astat();
        System.out.println(astat.b);

        System.out.println(at.a);
    }
}
*/
/*
class astat{
     int a;
     int b;

     static int v;
     static int w;

     static{
         //a=23;//wrong
         v=11;
         w=55;
     }
//non-static block
     {
        a=43;
        b=12;
     }

     static void dis(){
         System.out.println("v "+v+" w "+w);
     }

     void dis1(){
         System.out.println("a "+a+" b "+b);
     }
}
public class staticuse{
    public static void main(String[] args) {
        System.out.println(astat.v);
        System.out.println(astat.w);

        astat.dis();
        System.out.println();

        astat a=new astat();
        System.out.println(a.a);
        System.out.println(a.b);
        a.dis1();

    }
}
 */

/*
class astat{
    int a;
    int b;

    static int v;
    static int w;

    static{
        //a=23;//wrong
        v=11;
        w=55;
        System.out.println("static block");
    }
    //non-static block
    {
        a=43;
        b=12;
        System.out.println("non-static block");
    }

    static void dis(){
        System.out.println("v "+v+" w "+w+" static method");
    }

    void dis1(){
        System.out.println("a "+a+" b "+b+" non-static method");
    }
}
public class staticuse{
    public static void main(String[] args) {//when main method called static var and static block executed
        System.out.println("main method loaded");
        astat as=new astat();//when obj created -stat var->static block->non static block
         as.dis1();
        astat.dis();//when static method created static var->static block->static method
    }
}
 */
/*
class astat{
    int a=23;
    int b=5;
    static int count=0;
    static int schedule=0;
    String name;

    {
        b++;
        System.out.println("non-static "+b);

    }
    void des(){
        a++;
        System.out.println("instance block "+a);
    }

    static {
        count++;
        System.out.println("static block "+count);
    }

    static void dis(){
        schedule++;
        System.out.println(schedule+" static method ");
    }
}
public class staticuse{
    public static void main(String[] args) {//static var->static block-
     astat as=new astat();//static var->static block->non-static-block
     astat.dis();
     as.des();

    }
    }

 */
//memory allocated only once in stack when class loaded by jvm
/*
class astat{
    int a=3;
    int b=6;
    static int c;
    static int d;
    String name;

    astat(){
        this("govinda");
        c++;//1
        d++;//1
        System.out.println("c "+c+" d "+d);
    }

    astat(String name){
        a++;//4,4
        b++;//7,7
        System.out.println("a "+a+" b "+b);
    }
}
public class staticuse{
    public static void main(String[] args) {
        //separate copy of inst var(a,b) for 2 objts (as,as1) and same copy of static variables(c,d) for both objts(as,as1)
        astat as=new astat();//instance vars(a,b) a=3,b=7 for obj(as) and static vars c=0,d=0 becomes a=4,b=7 & c=1,d=1
        System.out.println();
        astat as1=new astat();//instance vars(a,b) a=3,b=7 for obj(as1) & static vars c=1,d=1becomes a=4,b=4 & c=2,d=2
    }
    }

 */
/*
   //non-static block called  inside constr one time  in first line by default only when equivalent constr  called
class astat{
    int a;
    int b;
    static int count;
    String name;
    //constr
    astat(int u){
        //non-static block called for obj3 //count=3;
        a=u;
        System.out.println("constr with one int para 'a' " +a);
    }
    astat(String name){
        //non-static block called //count=2 for obj2
        this(45,67);
        this.name=name;
        System.out.println("constr with one  string param"+name);
    }
    astat(int e,int r){
        //non-static block called //count=1 for obj1
        this(6);
        a=e;
        b=r;
        System.out.println("constr with two param"+e+" "+r);
    }
    //non-static block
    {
        count++;
        System.out.println(count+" count");
    }

}
public class staticuse{
    public static void main(String[] args) {
       astat as=new astat(1,6);
       astat as1=new astat("lakshmi");
       astat as2=new astat(8);
       //3 constrs called so in that 3 constrs non-static block called
    }
    }
 */
//s.i=(ptr)/100
/*
class astat{
   private  float p;
   private static  float t;
   private static float r;
   private float si;

   //non-static block
   {
       System.out.println("non-static block executed in first line in constr");
   }

   astat(float p){
   //non-static included
       this.p=p;
      System.out.println("constructor principal "+p);
   }
   static{
       r=5.67f;
       t=2;
       System.out.println("static block");
   }
   void calculate(){
      si=(p*t*r)/100;
       System.out.println("si "+si);
   }

     void  findrate(){
       r=(si*100)/(p*t);
       System.out.println("calculated rate "+r);
   }
   static void findtime(){
     //  t=2;
       System.out.println("static method rate,time "+r+" "+t);
   }

}
public class staticuse{
    public static void main(String[] args) {//static var->static block
      astat as=new astat(15000);//static var->static block->non static block
      as.calculate();
      as.findrate();
      as.findtime();

    }
    }
 */
/*
class astat{
    private float p;
    private static float t;
    private  static float r;
    private float si;
     //non-static block
    {
        System.out.println("enter principal amount");
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
    }
    static{
        System.out.println("enter time");
        Scanner sc=new Scanner(System.in);
        t=sc.nextFloat();
        System.out.println("enter rate");
        r=sc.nextFloat();
        System.out.println("r and t "+r+" "+t);
    }
    astat(){
        System.out.println(p+" p");
    }

    void calculate(){
        si=(p*t*r)/100;
        System.out.println(si+" si");
    }

    static void calc (){
        System.out.println("t "+t);
    }
}
public class staticuse{
    public static void main(String[] args) {//static var--static block
     astat as=new astat();///static var--static block ---non-static block
      as.calculate();

      //static() calling
      astat.calc();
    }
    }
 */
class astat {
    int a;
    static int c;

    astat(int a){
        this.a=a;
        System.out.println("constr a "+a);

    }

    {
        System.out.println("non-static block");
    }

    static{
        c=3;
        System.out.println("static block c "+c);
    }

}
public class staticuse {
    static void staticmethod(){
        System.out.println("staticuse method in main method accessing static var from astat class  using classname"+ astat.c);
        astat.c=34;
        System.out.println("changed c value "+ astat.c);

    }
    public static void main(String[] args) {//static var--static block
        astat as=new astat(3);
        staticuse.staticmethod();

    }
}
/*
//method hiding:static method participate in inheritance but cant override the child class method instead treat it is specialized method
class pa{
    public static void a1(){//static method inherited
       System.out.println("pa class");
    }
}
class ca extends pa{

    public static void a1(){
        System.out.println("ca class");
    }
}
public class methodhiding {
    public static void main(String args[]){
        pa p=new ca();
        ca c=new ca();
        c.a1();
        p.a1();
    }
}

 */