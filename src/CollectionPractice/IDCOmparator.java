package CollectionPractice;

import java.util.Comparator;

public class IDCOmparator implements Comparator<StudentComparator> {
    public int compare(StudentComparator o1,StudentComparator o2){
        if(o1.getId()>o2.getId()){
            return 1;
        }
        else{
            return -1;
        }
    }

}
