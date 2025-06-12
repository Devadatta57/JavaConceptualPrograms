package hasadepmainclass;
import hasadependentarget.mtomcourses;
import hasadependentarget.mtomstudents;
public class mtomcoursestudent {
    public static void main(String[] args) {
        mtomcourses[] mc=new mtomcourses[3];//array created here

        //create an arrayclass for the array we have created mtomcourses and pass the objs to it
        mtomcourses mm=new mtomcourses(1,"java");//array obj1
        mtomcourses mm1=new mtomcourses(2,"sql");//array obj2
        mtomcourses mm2=new mtomcourses(2,"html");//array obj3

        mc[0]=mm;
        mc[1]=mm1;
        mc[2]=mm2;
        //pass arrayref not objs in array
       //mtomstudents mms=new mtomstudents(11,"govinda",mm);//obj of array
        mtomstudents mms=new mtomstudents(11,"govinda",mc);
        mtomstudents mms1=new mtomstudents(12,"lakshmi",mc);
        mtomstudents mms2=new mtomstudents(13,"shivparv",mc);
        mms.dis();
        mms1.dis();
        mms2.dis();

    }
}
