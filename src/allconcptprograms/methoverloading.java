package allconcptprograms;
//polymorphism:method overloading,run-time polymorphism

public class methoverloading {
    int a=12;
    int b=45;
    public  void dis(){
        System.out.println("display");
    }
    public int govi(int a,int b){
        int c=a+b;
        return c;
    }

    public void govi(){
        int c=a+b;
        System.out.println(a+" a "+b+" b "+c+" c ");
    }
    public void govi(int a,int b,int c){
        int d=a+b+c;
        System.out.println(d);
    }
    void govi(float a,float b){
        float c=a+b;
        System.out.println(c);

    }
    void govi (float a,float b,float c){
        float d=a+b+c;
        System.out.println(d);

    }
    void govi(double a,double b,double c){
        double d=a+b+c;
        System.out.println(d);

    }
    void govi(double a,double b){
        double c=a+b;
        System.out.println(c);

    }
    boolean govi(boolean a,boolean b){
        if(a==true && b==true)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        methoverloading m=new methoverloading();
        m.dis();
        m.govi();
        //passing value as a constant
        int f = m.govi(4,5);
        System.out.println(f);

        m.govi(3,2,1);
        m.govi(2.3f,6.4f);
        m.govi(2.1f,6.7f,9.6f);
        m.govi(2.1,4.2);
        m.govi(1.2,3,5.1);
        boolean v=m.govi(false,true);
        System.out.println(v);
        boolean v1=m.govi(true,true);
        System.out.println(v1);
        //passing value  from variable
        int  a=1,b=2,c=4;
        float x=2.3f,y=5.3f,z=6.8f;
        double r=5.3,s=1.3,t=4.6;
        boolean g=true,h=false;
        m.govi(c,b,a);
        m.govi(y,z);
        m.govi(r,t,s);
        m.govi(x,y,z);
        System.out.println(m.govi(g,h));

    }
}