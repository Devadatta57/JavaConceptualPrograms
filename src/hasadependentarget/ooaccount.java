package hasadependentarget;
/*
Identifying Dependent and Target
Who owns the dependency?
The dependent owns the dependency (e.g., Person "has-a" Address).
Who is being depended on?
The target is the resource or helper (e.g., Address provides details to Person).
 */
//one-to-one:an employee(dependent) has an account(target)
public class ooaccount {
    public int accno;
    public int acctype;
    public String accname;
    //constructor
    public  ooaccount(int accno,int acctype,String accname){
        super();
        this.accno=accno;
        this.acctype=acctype;
        this.accname=accname;
    }
}
