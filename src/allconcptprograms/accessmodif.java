package allconcptprograms;

//private accessmodifier
/*
class privateuse{
    private int a;
    private int b;
}
public class accessmodif {
    public static void main(String[] args) {
        privateuse p=new privateuse();
        //System.out.println(p.a);

    }
}
 */
//default:accessed from inside and t a class within same package but not outside the package
/*
 class defaultuse{
    int a=8;
    int b;
    void msg(){
        System.out.println("default use in msg");
    }
}
public class accessmodif {
    public static void main(String[] args) {
        defaultuse u=new defaultuse();
        u.msg();
        System.out.println(u.a);

    }
}
 */
//protected


/*
public class accessmodif {
    protected int a=6;
    protected int b=3;
    protected void msg(){
        System.out.println("default use in msg");
    }
    public static void main(String[] args) {
       accessmodif a=new accessmodif();
       a.msg();
        System.out.println();

    }
    }

 */

public class accessmodif {
    public int a=6;
    public void msg(){
        System.out.println("default use in msg");
    }

}