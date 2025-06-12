package allconcptprograms;

/*
class enc{
    private int a;
    private int b;
    private String name;
    public void setA(int q){
        a=q;
    }
    public void setB(int z){
       b=z;
    }
    public void setName(String n){
        name=n;
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

public class encapsulat {
    public static void main(String[] args) {
       enc e=new enc();
       e.setA(12);
       e.setB(89);
       e.setName("govinda govinda");
       int a1=e.getA();
       int b1=e.getB();
       String v=e.getName();
       System.out.println(a1);
       System.out.println(b1);
       System.out.println(v);

    }
}
 */
//shadowing:naming conflicts between instance and local var
/*
class enc{
    private int a;
    private int b;
    private String name;
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setName(String name){
        this.name=name;
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
public class encapsulat {
    public static void main(String[] args) {
       enc e=new enc();
       e.setA(12);
       e.setB(25);
       e.setName("govinda govinda");
       System.out.println(e.getA());
        System.out.println(e.getB());
        System.out.println(e.getName());
    }
    }
 */
class enc{
    private int a;
    private int b;
    private String name;
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setName(String name){
        this.name=name;
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
public class encapsulat {
    public static void main(String[] args) {
        // Each object of the enc class maintains its own state, which is why e and e1 have independent values for their fields.
        enc e=new enc();
        e.setA(12);
        e.setB(25);
        e.setName("govinda govinda");
        System.out.println(e.getA());
        System.out.println(e.getB());
        System.out.println(e.getName());

        System.out.println();

        enc e1=new enc();
        e1.setA(78);
        e1.setB(90);
        e1.setName("shivaparvaty");
        System.out.println(e1.getA());
        System.out.println(e1.getB());
        System.out.println(e1.getName());
    }
}