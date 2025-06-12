package CollectionPractice;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentComparator> {
     public int compare(StudentComparator o1,StudentComparator o2){
         if(o1.getCgpa()>o2.getCgpa()){
             return 1;
         }
         else{
             return -1;
         }
     }


}
