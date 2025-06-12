package ComparatorPractise;

import ComparablePractise.Student;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
    public static void main(String[] args) {
//        TreeSet<Employee> t=new TreeSet<Employee>(new IdComparator());
       // TreeSet<Employee> t=new TreeSet<Employee>(new AgeComparator());
        TreeSet<Employee> t=new TreeSet<Employee>(new NameComparator());


        t.add(new Employee(1,"nobita",23));
        t.add(new Employee(56,"atta",89));
        t.add(new Employee(9,"monk",22));

        Iterator it=t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
