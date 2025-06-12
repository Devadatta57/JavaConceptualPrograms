package CollectionHashSet;



import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
    public static void main(String[] args) {
      HashSet<Employee> h=new HashSet<Employee>();
        h.add(new Employee(12,"deva",45));
        h.add(new Employee(17,"eva",5));
        h.add(new Employee(2,"vau",450));
        h.add(new Employee(1,"a",7));
      h.add(new Employee(12,"deva",45));
      h.add(new Employee(17,"eva",5));
      h.add(new Employee(2,"vau",450));
      h.add(new Employee(1,"a",7));

        Employee e1=new Employee(1,"deva",45);
        Employee e2=new Employee(5,"dva",5);
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
      System.out.println(e1.hashCode());




      Iterator it=h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
