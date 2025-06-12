package ObjectFood;

public class User {
  //  public void OrderFood(Swiggy sw){
  //sw.swiggyOrder();
  //  }

   // public void OrderFood(Dominos dm){
      //     dm.DominosOrder();
      //  }

   public void OrderFood(Object ob){
         if(ob instanceof Swiggy){
           //  ob.swiggyOrder();becoz at compile time it checks in object class for swiggyorder()  but we get that swiggy class  in runtime so downcast it
            ((Swiggy) ob).swiggyOrder();
         }else if(ob instanceof Zomato){
             ((Zomato) ob).zomatoOrder();
         }else if(ob instanceof Dominos){
             ((Dominos)ob).DominosOrder();
         }
   }

    }

