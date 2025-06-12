package excepcodegnan;

public class circle {
    private double radius;
    private static double PI=3.14;

    public circle(double radius){
        this.radius=radius;
    }

   public void  printArea(){
        try {
            if (radius < 0) {
                throw new RadiusException("Invalid radius");
            }
            double area=2*3.14*radius*radius;
            System.out.println(area);

        }
        catch(RadiusException e){
            e.printStackTrace();
        }
   }
    public void printPerimeter( ){
        try {
            if (radius < 0) {
                throw new RadiusException("Invalid radius");
            }
            double perimeter=3.14*radius*radius;
            System.out.println(perimeter);
        }
        catch(RadiusException e){
            e.printStackTrace();
        }

        }

    }


