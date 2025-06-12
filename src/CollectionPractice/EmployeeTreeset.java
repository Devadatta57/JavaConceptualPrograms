package CollectionPractice;

public class EmployeeTreeset implements Comparable<EmployeeTreeset>{
    private int id;
    private String name;
    private int age;
    public EmployeeTreeset(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int getId(){
        return  id;
    }
    public String getName(){
        return  name;
    }
    public int getAge(){
        return  age;
    }

    public String toString(){
       return id+" "+name+" "+age;
    }

    //based on id comparable-descending
    public int compareTo(EmployeeTreeset e){
        if(this.id>e.id){
            return -1;
        }
        else{
            return 1;
        }
    }

    //based on age
//    public int compareTo(EmployeeTreeset e){
//        if(this.age>e.age){
//            return 1;
//        }
//        else{
//            return -1;
//        }
//    }
//    public int compareTo(EmployeeTreeset e){
//       return this.name.compareTo(e.name);
//    }

}
