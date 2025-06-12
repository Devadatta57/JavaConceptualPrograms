package hasadependentarget;
//
//one-to-many-a branch has multiple emp
/*
A branch can have multiple employees, hence branch is the target.
An employee belongs to one branch, hence employee is the dependent.
 */
//multiple emp class
//emp dependent on branch so emp is dependent on branch target
//branch-target
public class otombranch {
    int brnum;
    String brname;
    public otombranch(int brnum,String brname){
        this.brnum=brnum;
        this.brname=brname;
    }

}
