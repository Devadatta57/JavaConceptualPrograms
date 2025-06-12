package allconcptprograms;
class constr{
    int fno;
    int gno;
    String name;
    constr(int fno,int gno){
        this.fno=fno;
        this.gno=gno;
        System.out.println(fno+" fno "+gno+" gno");
    }
    constr(String name){
        this(23,78);
        this.name=name;
        System.out.println(name+" name");
    }
    constr(){
        this("saras");
        System.out.println("constructor called");
    }
    //instead of setters -constr,and getters as it is implemented for getting values when constr concept used
    public int getFno(){
        return fno;
    }
    public int getGno(){
        return gno;
    }
    public String getName(){
        return name;
    }

}
public class constrchaini {
    public static void main(String[] args) {
        constr c=new constr();
        System.out.println(c.getFno());
        System.out.println(c.getGno());
        System.out.println(c.getName());


        System.out.println();

        constr c1=new constr(34,78);
        System.out.println(c1.getFno());
        System.out.println(c1.getGno());
        System.out.println(c1.getName());

        System.out.println();

        constr c2=new constr("shiva");
        System.out.println(c1.getFno());
        System.out.println(c1.getGno());
        System.out.println(c1.getName());

    }
}
