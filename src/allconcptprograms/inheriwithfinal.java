package allconcptprograms;



//final value cant be changed

class pparent{
    final int a=78;
    {
       // a=56;
    }
}
class childd extends pparent{

}
public class inheriwithfinal {
    public static void main(String[] args) {

    }
}


//final method willbe inherited but not  overriden
/*
class pparent{
 final void meth(){
     System.out.println("final meth in parent");
 }
}
class childd extends pparent{

  //  void meth(){
//
   // }
}
public class inheriwithfinal {
    public static void main(String[] args) {
      parent p=new parent();
      p.meth();

    }
}

 */

//final class cant be inherited
/*
final class pparent{

}
class childd extends parent{

}
public class inheriwithfinal {
    public static void main(String[] args) {

    }
}

 */

