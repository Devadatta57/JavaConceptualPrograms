package defaultacc;
import allconcptprograms.accessmodif;
//for default:outside package not accessible
/*
public class defaultac {
    public static void main(String[] args) {
//  defaultuse u=new defaultuse();
        //u.a;
    }
}
 */
//protected:accessible through ouside package through is-a rel
/*
public class defaultac extends accessmodif {
    public static void main(String[] args) {
       // accessmodif d=new accessmodif();//we cant access through parent class obj as  subclass inherits access through subclass
        defaultac d=new defaultac();//defaultac inherits the msg() method, so it can be accessed by creating an instance of defaultac.
        d.msg();
    }
    }

 */
//not without is-a
/*
public class defaultac {
    public static void main(String[] args) {
        // accessmodif d=new accessmodif();//we cant access through parent class obj as  subclass inherits access through subclass
        defaultac d=new defaultac();//defaultac inherits the msg() method, so it can be accessed by creating an instance of defaultac.
        d.msg();
    }
}

 */
//public:without inheritance concept how can we can a method from otherclass frpm other pkg even for public accessmodi...
public class defaultac extends accessmodif{
    public static void main(String[] args) {
        defaultac d=new defaultac();//defaultac inherits the msg() method, so it can be accessed by creating an instance of defaultac.
        d.msg();
    }
}