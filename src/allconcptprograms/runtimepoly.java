package allconcptprograms;



/*
class plane1{
    public void takeoff(){
        System.out.println("plane takeoff");
    }
    public void fly(){
        System.out.println("plane fly");
    }
    public void landing(){
        System.out.println("plane landing");
    }
}
class cargoplane1 extends plane1{
    public void fly(){
        System.out.println("cargoplane fly");
    }

}
class passengerplane1 extends plane1{
    public void fly(){
        System.out.println("passengerplane fly");
    }
}
class commonclass{
    public void met(plane1 p){
        p.takeoff();
        p.fly();
        p.landing();
    }
}
public class runtimepoly {
    public static void main(String[] args) {
       cargoplane1 cg=new cargoplane1();
       passengerplane1 pg=new passengerplane1();
       commonclass cc=new commonclass();
       //cc.met(cg);
      //cc.met(pg);


        plane1 pp;
        pp=new cargoplane1();
        pp.landing();
        pp.fly();
        pp.takeoff();

        pp=new passengerplane1();
        pp.fly();
        pp.takeoff();
        pp.landing();
    }
    }
 */

/*
class ptarent{
    public void cry(){
        System.out.println("parent hello");
    }
}
class cchild1 extends ptarent{
    public void cry(){
        System.out.println("child1 hello");
    }
    public void eat(){
        System.out.println("child1 eat");
    }
    public void spec(){
        System.out.println("child1 spec");
    }

}
class cchild2 extends ptarent{
    public void cry(){
        System.out.println("child2 hello");
    }
    public void eat(){
        System.out.println("child2 eat");
    }
    public void specii(){
        System.out.println("child2 spec");
    }
}
public class runtimepoly {
    public static void main(String[] args) {
        //tight coupling
       // ptarent p=new ptarent();
       // p.cry();

        //tight coupling
       // cchild1 c=new cchild1();
       // c.cry();

        //loose coupling
        /*
        ptarent p=new cchild1();
        p.cry();
        ptarent p1=new cchild2();
        p1.cry();

         */

        /*
        cchild1 c=new cchild1();
       // c.cry();

        cchild2 c1=new cchild2();
        //c1.cry();

        ptarent p;
        p=c;
        p.cry();
        p=c1;
        p.cry();

         */

        /*
        cchild1 c=new cchild1();
        c.cry();
        ptarent p;
        p=c;
        p.cry();//with parent ref we are calling child class cry() called upcasting
        //if we want to  call the child class specialized method not in parent class use downcasting(converting  from parentref to childref again)
        ((cchild1)p).eat();

        cchild2 c1=new cchild2();
        //c1.cry();
        ptarent p;
        p=c1;
        p.cry();
        ((cchild2)p).eat();

         */

        /*
    cchild1 c=new cchild1();
    cchild2 c1=new cchild2();
    ptarent p;
    p=c;
    p.cry();
    ((cchild1)p).eat();
    ((cchild1) p).spec();

    p=c1;
    p.cry();
    ((cchild2)p).specii();
         */


   // }
  //  }


class par{
    public void dis(){
        System.out.println("diap parent");
    }
    public void is(){
        System.out.println("is parent");
    }
}
class chi1 extends par{
    public void dis(){
        System.out.println("diap child1");
    }
    public void is(){
        System.out.println("is child1");
    }
}
class chi2 extends chi1{
    public void dis(){
        System.out.println("diap child2");
    }
    public void is(){
        System.out.println("is child2");
    }
    public void  spec(){
        System.out.println("spec child2");
    }
}
class commonclass1{
    void met(par p){//upcasting-keeping child ref in parent ref and calling m,et using parentref
        p.dis();
        p.is();
    }
}
public class runtimepoly {
    public static void main(String[] args) {
     chi1 c=new chi1();
     chi2 cc=new chi2();

     commonclass1 cm=new commonclass1();
     cm.met(c);
     cm.met(cc);
     //downcasting to call met which is not in par class
     par p;
     p=cc;
     ((chi2)p).spec();


    }
    }
