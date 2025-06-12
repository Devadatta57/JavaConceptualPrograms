package TreeSet;

public class Student {

        private int id;
        private String name;
        private double salary;
        private double cgpa;

        public Student(int id, String name, double salary,double cgpa){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.cgpa=cgpa;
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
        public double getCgpa(){
            return cgpa;
        }


    public String toString(){
            return id+" "+name+" "+salary;
        }
}
