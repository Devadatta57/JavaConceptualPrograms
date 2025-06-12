package hasadependentarget;
//many to many
//courses to students
//students-dependent
public class mtomstudents {
   int stid;
   String stname;
   mtomcourses[] mtom;//many to many,courses are many so use[]
   public mtomstudents(int stid,String stname,mtomcourses[] mtom){
       this.stid=stid;
       this.stname=stname;
       this.mtom=mtom;
   }
   public void dis(){
       System.out.println("student id "+stid);
       System.out.println("student name "+stname);

       //courses are many so use array
       for(mtomcourses c:mtom) { //arraytype-mtomcourses,mtom-refvar so use array to iterate over that courses
          // System.out.println("course  id " + mtom.cid);
           System.out.println("course  id " + c.cid);
           System.out.println("course  name " + c.crname);
           System.out.println();
       }

   }
}
