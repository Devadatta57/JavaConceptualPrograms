package ComparablePractise;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int id;
    private  String name;
    private int age;
    public Student(int id,String name,int age){
      this.id=id;
      this.name=name;
      this.age=age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return id+" "+name+" "+age;
    }
//    public int compareTo(Student s1){
//        if(this.id>s1.id){
//            return 1;
//        }
//        else{
//            return -1;
//        }


//    public int compareTo(Student s1){
//        if(this.age>s1.age){
//            return -1;
//        }
//        else{
//            return 1;
//        }
//    }

   public int compareTo(Student s1){
        return this.name.compareTo(s1.name);
   }

}
