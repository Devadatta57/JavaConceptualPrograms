package Java8features;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String location;
    private int experience;

    public Employee(int id,String name,int age,double salary,String location,int experience){
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.location=location;
        this.experience=experience;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", experience=" + experience +
                '}';
    }
}
