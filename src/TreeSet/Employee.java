package TreeSet;

public class Employee implements  Comparable<Employee> {

        private int id;
        private String name;
        private double salary;

        public Employee(int id,String name,double salary){
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
            return  salary;
        }
//
//        public int compareTo(Employee o){
////            if(this.id>o.id){//bases on id swapping like in array (in ascendsing order)
////                return 1;
////            }
////            else{
////                return -1;
////            }
//            if(this.id>o.id){//bases on id swapping like in array
//                return -1;
//            }
//            else{
//                return 1;
//            }
//        }

    public int compareTo(Employee o) {
          return  this.name.compareTo(o.name);
    }



    public String toString(){
            return id+" "+name+" "+salary;
        }


}
