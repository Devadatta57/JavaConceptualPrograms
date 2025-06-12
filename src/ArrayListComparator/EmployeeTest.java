package ArrayListComparator;

import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
//        TreeSet<Employee> t=new TreeSet<Employee>(new IdComparator());
       // TreeSet<Employee> t=new TreeSet<Employee>(new AgeComparator());
        ArrayList<Employee> t=new ArrayList<Employee>();


        t.add(new Employee(1,"nobita",23));
        t.add(new Employee(56,"atta",89));
        t.add(new Employee(9,"monk",22));

        Collections.sort(t, new NameComparator());

        Iterator it=t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
