package allconcptprograms;



/*
class constr{
    int a;
    int b;
    String name;
    //common setter:to initialize values of fields
    public constr(int a,int b,String name){
        this.a=a;
        this.b=b;
        this.name=name;
        int d=10;
        System.out.println(a+" "+b+" "+d+" "+name);
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public String getName(){
        return name;
    }
}
public class construclass {
    public static void main(String[] args) {
     constr c=new constr(1,5,"saraswaty");
     System.out.println(c.getA());
     System.out.println(c.getB());
     System.out.println(c.getName());
    }
}
 */
/*
class constr{
//constr without default and parametrized includes default

}
public class construclass {
    public static void main(String[] args) {
      constr c=new constr();

    }
    }

 */
//const with prametrized never include default construc,it executes default constr only when there is no construct

class constru{
    int a;
    constru(int a){
        this.a=a;
    }
    public void dis(){
        System.out.println(a);
    }
}
public class construclass {
    public static void main(String[] args) {
     //constr q=new constr();executes only when no constr defined,if there is no default const mentioned and  parametrized  called first then jvm wont involve default construc by thinking user knows cost concept it throws error
     constru c=new constru(3);
     c.dis();
    }
    }


