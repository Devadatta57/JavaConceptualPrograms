package ComparablePractise;
import java.util.Iterator;
import java.util.TreeSet;
public class StudentTest {
    public static void main(String[] args) {
        TreeSet<Student> t=new TreeSet<Student>();
        t.add(new Student(1,"nobita",23));
        t.add(new Student(56,"atta",89));
        t.add(new Student(9,"monk",22));

        Iterator it=t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
