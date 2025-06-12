package excepcodegnanpractice;

public class CircleTest {
    public static void main(String[] args) {
        circle c=new circle(-1.23);
        try{
            c.printArea();
        }catch( Radiusexception e){
            e.printStackTrace();
        }

    }
}
