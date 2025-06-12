package excepcodegnan1;

public class circle {
    private double radius;
    private double PI=3.14;

    public circle(double radius){
        this.radius=radius;
    }

     public void printArea()throws CustomRadiusExcep{
        if(radius<0){
                throw new CustomRadiusExcep("Invalid radius");
        }

     }
     public void printPerimeter()throws CustomRadiusExcep{
        if(radius<0){
                throw new CustomRadiusExcep("Invalid radius");
        }
        double perimeter=3.14*radius*radius;
         System.out.println(perimeter);

     }
}
