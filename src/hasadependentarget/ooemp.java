package hasadependentarget;

//one-to-one:an employee(dependent) has an account(target)
public class ooemp {
    int empid;
    String emname;
    //has-a var(Employee has an Account)
    ooaccount ooa;
    //constructor injection
    public ooemp(int empid,String emname,ooaccount ooa){
        super();
        this.empid=empid;
        this.emname=emname;
        this.ooa=ooa;
    }
    public void dis(){
        System.out.println("empid "+empid);
        System.out.println("empid "+emname);
        System.out.println("=====================");
        System.out.println("accno "+ooa.accno);
        System.out.println("acctype "+ooa.acctype);
        System.out.println("accname "+ooa.accname);

    }
}
