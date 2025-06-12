package CollectionPractice;
import java.util.Iterator;
import  java.util.TreeSet;
//user-defined objts treeset cant osrt by default so use comparator
public class StudentComparatorTest {
    public static void main(String[] args) {
//        TreeSet<StudentComparator> t=new TreeSet<StudentComparator>(new IDCOmparator());
      //  TreeSet<StudentComparator> t=new TreeSet<StudentComparator>(new IDCOmparator());
        TreeSet<StudentComparator> t=new TreeSet<StudentComparator>(new StudentnameComparator());


        t.add(new StudentComparator(1,"deva",7));
        t.add(new StudentComparator(16,"eva",97));
        t.add(new StudentComparator(13,"va",79));
        t.add(new StudentComparator(10,"a",11));


//        for(StudentComparator s:t){
//            System.out.println(s);
//        }
        Iterator it=t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
