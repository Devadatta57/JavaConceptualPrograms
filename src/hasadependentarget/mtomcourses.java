package hasadependentarget;
//many-to-many
//courses and students
/*
Dependent Class:
A dependent class relies on another class to establish or complete its relationships or associations.
In our case, the Student class is the dependent because a student's enrollment depends on the existence of courses. A student can't be enrolled in courses unless those courses exist.

Target Class:
The target class is the one being referred to or related to by the dependent class. It often represents the entity that the relationship is "pointing to."
Here, the Course class is the target because it is the entity that students are enrolling in.
 */
//courses class - target class
public class mtomcourses {
    int cid;
    String crname;
    public mtomcourses(int cid,String crname){
        this.cid=cid;
        this.crname=crname;
    }

}
