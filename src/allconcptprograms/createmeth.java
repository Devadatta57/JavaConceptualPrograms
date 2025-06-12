package allconcptprograms;
public class createmeth {
    String name;
    int i;
    public int method(int i){
        return i;
    }
    public char ket(char d){
        return d;
    }
    public String  hello(String s){
        return s;
    }
    public static void main(String[] args) {
        createmeth c=new createmeth();
        c.name="lakshmi";
        int h=c.method(5);
        System.out.println(h);
        System.out.println(c.name);
        c.govinda();

        char d=c.ket('g');
        System.out.println(d);

        String s=c.hello("alimelu");
        System.out.println(s);


    }
    public void govinda(){
        System.out.println("govinda");
    }
}
