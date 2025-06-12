package hasadepmainclass;
import hasadependentarget.otombranch;
import hasadependentarget.otomemp;
public class otombranchempmain {
    public static void main(String[] args) {
        otombranch om=new otombranch(1,"kllu");//one branch-
        otomemp ot=new otomemp(1,"govinda",om);//many emps
        otomemp ot1=new otomemp(2,"govi",om);
        otomemp ot2 =new otomemp(3,"gottt",om);
        ot.dis();
        ot1.dis();
        ot2.dis();
    }
}
