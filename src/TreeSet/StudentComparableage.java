package TreeSet;

import java.util.Comparator;

public class StudentComparableage implements Comparator<Student> {
    @Override
    public int compare(Student o1,Student o2){

//        if(o1.getSalary()>o2.getSalary()){
//             return  1;//1 means ascending order swap
//        }
//        else{
//            return -1;
//        }
        if(o1.getSalary()>o2.getSalary()){
            return  -1;//1 means ascending order swap
        }
        else{
            return 1;
        }

    }
}
