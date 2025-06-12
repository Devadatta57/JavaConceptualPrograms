package TreeSet;
import java.util.TreeSet;
public class EmployeeTest  {
    public static void main(String[] args) {
        TreeSet<Employee> t=new TreeSet<Employee>();

        t.add(new Employee(11,"deva",25000));
        t.add(new Employee(2,"rty",5000));
        t.add(new Employee(3,"yui",2000));
        t.add(new Employee(4,"mol",200));


        for(Employee e:t){
            System.out.println(e);
        }
    }
}
