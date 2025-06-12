package Java8features;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee(1,"deva",23,25000,"hyderabad",5));
        al.add(new Employee(11,"datta",3,5000,"hyderabad",8));
        al.add(new Employee(14,"darha",203,2000,"banglore",3));
        al.add(new Employee(62,"eva",293,8000,"vijayawada",1));
        al.add(new Employee(31,"efg",83,1000,"mysore",7));
        al.add(new Employee(61,"goat",233,89000,"hyderabad",78));
        al.add(new Employee(19,"govinda",93,775000,"banglore",56));
        al.add(new Employee(34,"poiu",43,2589000,"vijayawada",89));
        al.add(new Employee(451,"mloa",73,2785000,"banglore",11));

        //al.stream().filter((emp)->emp.getExperience()>=20).forEach((emp)->System.out.println(emp));
//       long count= al.stream().filter((emp)->emp.getExperience()>=20).count();
//       System.out.println(count);
//        al.stream().filter(
//                (emp)->emp.getAge()>=5
//                ).distinct().forEach((emp)->System.out.println(emp));
        //al.stream().filter((emp)->emp.getLocation().equals("banglore")).map((emp->emp.getName().toUpperCase())).forEach((emp)->System.out.println(emp));
//        al.stream().filter(emp->emp.getLocation().equals("hyderabad") && emp.getAge()>=50)
//                .map(emp-> {
//                    emp.setSalary((int)(emp.getSalary())+(int)(emp.getSalary()*0.2));
//                    return emp;
//                }
//        ).forEach((emp)->System.out.println(emp));

       // al.stream().filter((emp)->emp.getLocation()=="hyderabad").map((emp)->emp.getName().toUpperCase()).forEach((emp)->System.out.println(emp));
//        al.stream().filter((emp)->emp.getLocation().equals("hyderabad"))
//                  .filter((emp)->emp.getName().equalsIgnoreCase("Deva"))
//                .map((emp)->emp.getAge()).forEach((emp)->System.out.println(emp));

        al.stream().filter((emp)->emp.getLocation().equalsIgnoreCase("mysore")  && emp.getAge()==83)
                .map((emp)->{
                    emp.setSalary(emp.getSalary()+ emp.getSalary()*0.9);
                    return emp;
                }).forEach((emp)->System.out.println(emp));




    }
}
