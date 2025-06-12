package Java8features;

public class  AssertTest{
    public static void main(String[] args) {
//        AssertExam a=new AssertExam("","",90000);//assertion error with msg we have given (fname,lname-empty)
//        System.out.println(a.getFullname());
//        System.out.println(a.bonus());
//        AssertExam a1=new AssertExam("","tyu",90000);//assertion error(fname-empty)
//        System.out.println(a1.getFullname());
//        System.out.println(a1.bonus());
//        AssertExam a2=new AssertExam("gju","",90000);
//        System.out.println(a2.getFullname());
//        System.out.println(a2.bonus());
//        AssertExam a3=new AssertExam("cxcsdd",null,90000);//assertion error(lname can be empty but not null
//        System.out.println(a3.getFullname());
//        System.out.println(a3.bonus());
//        AssertExam a3=new AssertExam("cxcsdd","",-90000);//assertion error(salary is negative)
//       System.out.println(a3.getFullname());
//        System.out.println(a3.bonus());
        AssertExam a3=new AssertExam("cxcsdd","hkjn",89090);//assertion error(salary is negative)
       System.out.println(a3.getFullname());
        System.out.println(a3.bonus());


    }
}