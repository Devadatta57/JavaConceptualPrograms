package CollectionPractice;

import java.util.TreeSet;
//user-defined objts are not comparable by default implement comparable
public class EmployeeTreeSetTest {
    public static void main(String[] args) {
        TreeSet<EmployeeTreeset> t=new TreeSet<EmployeeTreeset>();
        t.add(new EmployeeTreeset(1,"vraa",34));
        t.add(new EmployeeTreeset(8,"datta",345));
        t.add(new EmployeeTreeset(3,"era",67));

      for(EmployeeTreeset s:t){
           System.out.println(s);
       }
    }
}
