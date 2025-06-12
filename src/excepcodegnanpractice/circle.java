package excepcodegnanpractice;

public class circle {
    private double radius;
    private double PI=3.14;
    public circle(double radius){
        this.radius=radius;
    }
    public void printArea()throws Radiusexception{
        if(radius<0){
            throw new  Radiusexception("Invalid Radius");
        }
        double area=PI*radius*radius;
        System.out.println(area);
    }


}
