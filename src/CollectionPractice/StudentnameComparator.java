package CollectionPractice;

import java.util.Comparator;

public class StudentnameComparator implements Comparator<StudentComparator> {
    public int compare(StudentComparator s1,StudentComparator s2){
        return s1.getName().compareTo(s2.getName());
    }

}
