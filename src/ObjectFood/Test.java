package ObjectFood;

public class Test {
    public static void main(String args[]){
  // if one person orders ,second person cant orders food becoz in user it will hold only one object like swiggy,dominos or zomato at a time it holds only one object
       // User deva=new User();
        //deva.OrderFood(new Swiggy());

       // User datta=new User();
      //  datta.OrderFood(new Dominos());

        User u=new User();
        u.OrderFood(new Swiggy());
        u.OrderFood(new Dominos());
        u.OrderFood(new Zomato());

    }
}
