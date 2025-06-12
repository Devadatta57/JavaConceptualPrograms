package allconcptprograms;
class created{
    int rollno;
    int num;
    String name;
}
public class arraycust {
    public static void main(String[] args) {
     //created c=new created();this is a obj
     created[] c=new created[3];//arraytype-createdtype(c-null,null,null)
     c[0]=new created();//(c-obj1,null,null)
     c[1]=new created();//(c-obj1,obj2,null)
     c[2]=new created();//(c-obj1,obj2,obj3)

     c[0].rollno=1;
     c[0].num=45;
     c[0].name="govinda";

     c[1].rollno=4;
     c[1].name="kanakadurgamma";

     System.out.println(c[0].name+" "+c[0].num);
     System.out.println(c[1].name+" "+c[1].num+" "+c[1].rollno);


    }
}
/*
class ther{
    int num=9;
    int rollno=8;
    String name="hello";
}
public class custclass {
    public static void main(String args[]){
        ther[] t=new ther[3];
        t[0]=new ther();
        t[1]=new ther();
        t[2]=new ther();
        t[0].num=23;
        t[1].rollno=45;
        System.out.println(t[0].num);
        System.out.println(t[1].name);
    }
}

 */
       /*
       =====ther[] t = new ther[3];
      =====  t --> [ null | null | null ]
               (0)   (1)   (2)
      =====  t[0] = new ther();
      =======  t --> [ Object1 | null | null ]
                       (0)      (1)    (2)
      =======t[1] = new ther();
       ======= t --> [ Object1 | Object2 | null ]
                      (0)      (1)       (2)
      =============Object1: num = 12, rollno = 35, name = "hello"
      =============Object2: num = 12, rollno = 35, name = "hello"
 */
