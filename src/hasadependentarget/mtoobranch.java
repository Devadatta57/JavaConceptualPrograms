package hasadependentarget;
//many-to-one
//one branch has many Students
//branch dependent on students
//branch-dependent
public class mtoobranch {
    int branchno;
    String branchname;
    mtoostudent mtoo;
    public mtoobranch(int branchno,String branchname,mtoostudent mtoo){
        this.branchno=branchno;
        this.branchname=branchname;
        this.mtoo=mtoo;
    }
    public void dis(){
        System.out.println("branchno "+branchno);
        System.out.println("branchname "+branchname);
        System.out.println("student id "+mtoo.sid);
        System.out.println("studentname  "+mtoo.stuname);
        System.out.println();

    }
}
