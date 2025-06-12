package excepcodegnancase2;

public class circle {
    private double radius;
    private static double PI=3.14;

    public circle(double radius){
        this.radius=radius;
    }
    public void printArea(){
        try {
            if (radius < 0) {
                throw new CustRadiusexc("Invalid Radius");
            }
            double area=3.14*radius*radius;
            System.out.println(area);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void printPerimter(){
        try {
            if (radius < 0) {
                throw new CustRadiusexc("Invalid Radius");
            }
            double area=3.14*radius*radius;
            System.out.println(area);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
