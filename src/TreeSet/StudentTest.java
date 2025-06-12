package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
//        TreeSet<Student> t=new TreeSet<Student>(new StudentComparableage());
        TreeSet<Student> t=new TreeSet<Student>(new StudentComparableName());


        t.add(new Student(11,"deva",25000,7.4));
        t.add(new Student(2,"rty",5000,4.5));
        t.add(new Student(3,"yui",2000,6.7));
        t.add(new Student(4,"mol",200,1.4));


//        for(Student e:t){
//            System.out.println(e);
//        }
        Iterator<Student> it=t.iterator();//iterator used to traverse the collection object
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
