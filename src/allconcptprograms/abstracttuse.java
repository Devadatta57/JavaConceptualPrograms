package allconcptprograms;
/*
abstract class loan1{
    abstract void eat();
    void cry(){
        System.out.println("crying in loan1");
    }
}
class cargoloan1 extends loan1{
    void eat(){
        System.out.println("eating in cargoplane");
    }
    void cry(){
        System.out.println("crying in cargoplane");
    }

}
class passloan1 extends loan1{
    void eat(){
        System.out.println("eating in passplane");
    }
    void cry(){
        System.out.println("crying in passplane");
    }
}
public class abstracttuse {
    public static void main(String[] args) {
        // loan1 l=new loan1();//abstract cant be instanstiated
        loan1 l=new cargoloan1();
        l.cry();
        l.eat();

        loan1 l2=new passloan1();
        l2.eat();
        l2.cry();
    }
}
 */
abstract class loa{
    abstract void cry();
}
class poa extends loa{
    void cry(){
        System.out.println("cry in  poa");
    }
    public void trry(){
        System.out.println("try in poa");
    }
}
class coa extends loa{
    void cry(){
        System.out.println("cry in coa");
    }
    public  void trry(){
        System.out.println("try in coa");
    }
}
public class abstracttuse {
    public static void main(String[] args) {

     poa p=new poa();
     coa c=new coa();

        loa l;
        l=p;
        l.cry();
        ((poa)l).trry();

        l=c;
        l.cry();
        ((coa)l).trry();


    }
    }