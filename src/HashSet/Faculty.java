package HashSet;

public class Faculty {
    private int id;
    private String name;
    private double salary;

    public Faculty(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "id "+id+" name "+name+" salary "+salary;
    }

    public boolean equals(Object obj){
      if(this==obj){
          return true;
      }
      else if(this==null){
          return false;
      }
      else if(this.getClass()!=obj.getClass()){
          return false;
      }
      else{
          Faculty faculty=(Faculty)obj;
          if((this.id== faculty.id) && (this.name==faculty.name) && (this.salary==salary)){
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
        hash=hash+(int)salary;
        return hash;
    }

}
