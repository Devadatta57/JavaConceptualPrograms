package allconcptprograms;
/*
interface one{
    void m1();
}
interface two{
    void m2();
}
class three implements one,two{
    public void m1(){
        System.out.println("m1 implemented in subclasses");
    }
    public void m2(){
        System.out.println("m2 implemented in subclasses");
    }
}
public class interfacesconc {
    public static void main(String[] args) {
           one o=new three();
           o.m1();
           //o.m2();//m2 not there in one interface so error ,m1 called from three class dynamically(dynamic method dispatch)

          two t=new three();
          t.m2();

    }
}

 */
/*
interface one{
    void m1();
}
interface two{
    void m2();
}
class three implements one{
    void m3(){
        System.out.println("m3");
    }
    public void m1(){
        System.out.println("m1 in three");
    }
}
class four extends three implements one,two{
//      public void m1(){
//         System.out.println("m1 in four");
//      }
    public  void m2(){
        System.out.println("m2 in four");
    }
    public void m4(){
        System.out.println("m4 in four");
    }
}
public class interfacesconc {
    public static void main(String[] args) {
        one o=new four();
        o.m1();
        //o.m2();//invalid becoz 'o' from interface one it knows the methods only from that interface eventhough obj created for four class it is from one interface class ,its type is interface one so kows only methods of one interface

        ((four)o).m4();//explicitly changing its type from type 'o' to four
        ((two)o).m2();
    }
    }
    */
/*
interface one{
    void m1();
}
interface two{
    void m2();
}
interface three extends one,two{
    void m3();
}
class four implements three{
    public void m1(){
        System.out.println("m1 in four");
    }
    public void m2(){
        System.out.println("m2 in four");
    }
    public void m3(){
        System.out.println("m3 in four");
    }
}
public class interfacesconc {
    public static void main(String[] args) {
      three  th=new four();
      th.m1();
      th.m2();
      th.m3();

    }
    }
    */
/*
interface one{
    int a=34;
}

public class interfacesconc implements one{
    public static void main(String[] args) {
          System.out.println(a);
    }
    }
 */
/*
interface one{
    int a=34;
}
public class interfacesconc implements one{
    public static void main(String[] args) {
   //  a=56;
     int a=45;
     System.out.println(a);
    }
    }
    */
//interface one{
  // void m1();
//}
//interface two{
//    void m1();
//}
//class three implements one,two{
//    public void m1(){
//       System.out.println("m1 in three");
//    }
//}
//public class interfacesconc{
//    public static void main(String[] args) {
//        one t=new three();
//        t.m1();
//        two t1=new three();
//        t1.m1();
//
//    }
//    }
//interfaces can contain static methods but they cant be inherited ,contain default methods can be inherited and overriden ,default method cant be static ,abstract method cant be default
interface one{
    static void m1(){
        System.out.println("static method in m1");
    }
    default void m2(){
        System.out.println("default  method in m2");
    }

    int a=89;
}
interface two extends one{
    int a=34;
//    default void m2(){
//        System.out.println("default  method in two");
//    }
}

public class interfaces implements two{
    public static void main(String[] args) {
        System.out.println(one.a);
       one.m1();
        two t=  new interfaces();

        t.m2();

        System.out.println(two.a);
//        System.out.println(two.m2());
    }
    }


