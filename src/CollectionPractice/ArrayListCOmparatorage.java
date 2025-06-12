package CollectionPractice;
import  java.util.Comparator;
public class ArrayListCOmparatorage implements Comparator<ArrayListcomparator> {
    public int compare(ArrayListcomparator s1,ArrayListcomparator s2){
        if(s1.getAge()>s2.getAge()){
            return 1;
        }
        else{
            return  -1;
        }
    }
}
