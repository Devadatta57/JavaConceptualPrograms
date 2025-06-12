package Strings;

class Employee{
    String name;
    String surname;
    String fathername;
    int aaid;

   public Employee(String  name,String surname,String fathername,int aaid){
       this.name=name;
       this.surname=surname;
       this.fathername=fathername;
       this.aaid=aaid;
   }
    public boolean equals(Object obj){
       if(obj==null){
           return false;
       }
       else if(this.getClass()!=obj.getClass()){
           return false;
       }else if(this==obj){
           return true;
       }else {
           Employee e1=(Employee)obj;
           if((this.surname==e1.surname) && (this.fathername==e1.fathername) && (this.aaid==e1.aaid)){
               return true;
           }
       }
      return false;
    }
}
public class ObjectToString {
    public static void main(String[] args) {
        Employee e=new Employee("Devadatta","chikati","srinivas",123);
        Employee e1=new Employee("attad","chikati","srinivas",123);
        System.out.println(e==e1);
        boolean result=e.equals( null);
        if(result){
            System.out.println("both are siblings");
        }else{
            System.out.println("both are  not siblings");
        }

    }
}
