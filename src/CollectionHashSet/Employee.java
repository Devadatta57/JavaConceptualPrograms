package CollectionHashSet;

public class Employee {
    private  int id;
    private String name;
    private int cgpa;
    public Employee(int id, String name, int cgpa){
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

    @Override
    public String toString() {
        return "Employee{" +
                "cgpa=" + cgpa +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        else if(this==null) {
            return false;
        }
        else if(this.getClass()!=obj.getClass()){
            return  false;
        }
        else{
            Employee e=(Employee)obj;
            if((this.id==e.id) && (this.name==e.name) && (this.cgpa==e.cgpa)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        int hash=13;
        hash=hash*17+id;
        hash=hash*17+name.hashCode();
        hash=hash*17+cgpa;
        return hash;
    }

}
