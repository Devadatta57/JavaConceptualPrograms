package HashSet;
import  java.util.HashSet;
public class FacultyTest {
    public static void main(String[] args) {
        HashSet<Faculty> h=new HashSet<Faculty>();
        h.add(new Faculty(1,"deva",25000));
        h.add(new Faculty(2,"doraemon",40000));
        h.add(new Faculty(3,"nobita",56000));
        h.add(new Faculty(4,"era",34444));

        h.add(new Faculty(1,"deva",25000));
        h.add(new Faculty(2,"doraemon",40000));
        h.add(new Faculty(3,"nobita",56000));
        h.add(new Faculty(4,"era",34444));

        for(Faculty obj:h){
            System.out.println(obj);
        }

        Faculty obj1=new Faculty(1,"deva",12000);
        Faculty obj2=new Faculty(2,"eva",34000);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj1.hashCode());
    }
}
