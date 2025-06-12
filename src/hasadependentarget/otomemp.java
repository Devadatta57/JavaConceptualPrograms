package hasadependentarget;
//one-to-many-a branch has multiple emp
/*
A branch can have multiple employees, hence branch is the target.
An employee belongs to one branch, hence employee is the dependent.
 */
//multiple emp class
//emp dependent on branch so emp is dependent on branch target
//emp-dependent
public class otomemp {
    public int empid;
    public String empname;
    //has-a var
    otombranch otom;
    //constructor-injection
    public otomemp(int empid,String empname,otombranch otom){
        this.empid=empid;
        this.empname=empname;
        this.otom=otom;
    }
    public void dis(){
        System.out.println("empid "+empid);
        System.out.println("empname "+empname);
        System.out.println("brnum "+otom.brnum);
        System.out.println("brname "+otom.brname);
        System.out.println();
    }

}
