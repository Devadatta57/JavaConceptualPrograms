package CollectionPractice;
import java.util.TreeSet;
public class StudentComparator {
    private  int id;
    private String name;
    private int cgpa;
    public StudentComparator(int id,String name,int cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getCgpa(){
        return cgpa;
    }
    public String toString(){
        return id+" "+name+" "+cgpa;
    }
}
