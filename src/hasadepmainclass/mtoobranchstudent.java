package hasadepmainclass;
import hasadependentarget.mtoobranch;
import hasadependentarget.mtoostudent;
public class mtoobranchstudent {
    public static void main(String[] args) {
        mtoostudent mtoos=new mtoostudent(1,"govi");//many students to
        mtoostudent mtoos1=new mtoostudent(2,"laks");
        mtoostudent mtoos2 =new mtoostudent(3,"shivparv");

        mtoobranch mtoob=new mtoobranch(1,"ineuron", mtoos);//one branch
        mtoobranch mtoob1=new mtoobranch(1,"ineuron", mtoos1);
        mtoobranch mtoob2 =new mtoobranch(1,"ineuron", mtoos2);

        mtoob.dis();
        mtoob1.dis();
        mtoob2.dis();

    }
}
