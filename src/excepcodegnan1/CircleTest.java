package excepcodegnan1;

public class CircleTest {
    public static void main(String[] args) {
        circle c=new circle(-3.4);

        try {
            c.printArea();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            c.printPerimeter();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
