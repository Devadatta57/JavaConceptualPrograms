package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class arraylistExample {
    public static void main(String[] args) {
        //all are integers ,floats ,so sorted using internal comparable method by  sort()
//        ArrayList<Integer> al=new ArrayList<Integer>();
//        al.add(12);
//        al.add(90);
//        al.add(-1);
//        al.add(5);

       // Collections.sort(al);
        //for user-defined objts we have to use comparator
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(1,"deva",123,6.4));
        al.add(new Student(2,"era",34454,1.4));
        al.add(new Student(3,"qwe",7888,7.0));
        al.add(new Student(4,"aqw",5666,8.3));
        //in treeset we have default sorting order so we pass comparator obj at the time of obj creation
        //here no default sorting like treeset in arraylist so pass obj in sorting method
        Collections.sort(al,new StudentComparableage());
        Iterator<Student> it=al.iterator();
        while(it.hasNext()){
           System.out.println(it.next());
        }

    }
}
