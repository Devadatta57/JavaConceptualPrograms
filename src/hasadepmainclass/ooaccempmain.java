package hasadepmainclass;
import hasadependentarget.ooaccount;
import hasadependentarget.ooemp;
//you can write both account and employee in same package and its main class in diff pkg
public class ooaccempmain {
        public static void main(String[] args) {
            //create target class obj first otherwise throws error
            ooaccount ac=new ooaccount(1,3,"ibsc");
            ooemp oe=new ooemp(5,"govinda",ac); // Creating an employee instance with the account instance passed to the constructor
            // ooaccount ac=new ooaccount(1,3,"ibsc");//not possible
            oe.dis();

    }
}
