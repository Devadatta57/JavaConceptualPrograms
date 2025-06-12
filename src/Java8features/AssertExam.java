package Java8features;
//assertion:assumption when tested fails generates assertion error after enabling it
public class  AssertExam{
    private String fname;
    private String lname;
    private double salary;
    public AssertExam(String fname,String lname,double salary){
        this.fname=fname;
        this.lname=lname;
        this.salary=salary;
    }

    public String getFullname(){
        assert fname!="" :"fname cant be empty";//assertion test after  enabling  assertion with msg ti be displayed when assumption failed
        assert lname!="": "lname cant be empty";
        assert fname!=null : "fname cant be null";
        assert lname!=null : "lname cant be null";
        String fullname=fname+lname;
        return fullname;
    }
    public double bonus(){
        assert salary>0.0 : "salary cant be negative";//salary cant be negative
        return salary*0.2;
    }
}
