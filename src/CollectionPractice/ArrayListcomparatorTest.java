package CollectionPractice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListcomparatorTest {
    public static void main(String[] args) {
        ArrayList<ArrayListcomparator> al=new ArrayList<ArrayListcomparator>();
        al.add(new ArrayListcomparator(1,"devadatta",34));
        al.add(new ArrayListcomparator(2,"rty",8));
        al.add(new ArrayListcomparator(3,"uio",90));
        //as treelist by default sorts in ascending order comparator class passed into arrraylist at a time of obj creation
        //but arraylist  not sorts by default as treeset so pass the comparator class obj in  sort method of arraylist along with arraylist obj

        Collections.sort(al,new ArrayListCOmparatorage());
        Iterator it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
