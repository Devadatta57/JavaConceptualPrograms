package allconcptprograms;
//1.we cant reduce visibilty of inherited methods in subclasses
/*
class animal{
    public void dog(){

    }
}
class bird extends animal{
   // void dog(){

   // }
}
public class overidingrules {
    public static void main(String[] args) {

    }
}
 */

//same return type of inheriting methods
/*
class animal{
    public void dog(){

    }
}
class bird extends animal{
     public void dog(){

     }
}
public class overidingrules {
    public static void main(String[] args) {

    }
}
 */
//parameters should be same  otherwise it become method overloading
/*
class animal{
int a;

    public void dog(int a){

    }
}
class bird extends animal{
    public void dog(int a){

    }
}
public class overidingrules {
    public static void main(String[] args) {

    }
}
 */
//return type diff but  ok if returntype  is covariant var
class loan{
    loan(){
        System.out.println("loan constr");
    }
}
class perloan extends loan{
    perloan(){
        System.out.println("perloan constr");
    }
}
class xe{
    public loan  met(){//returntype:loan(constr as retrun type with participates in inheritance)
        loan l=new loan();
        System.out.println(l);
        return l;
    }
}
class re extends xe{
    public perloan met(){//returntype:perloan but cpvariant var no problem
        perloan pl=new perloan();
        System.out.println(pl);
        return pl;
    }

}
public class overidingrules {
    public static void main(String[] args) {
     re r=new re();
     r.met();

    }
    }