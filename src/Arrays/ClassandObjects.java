package Arrays;
//1.Imagine you are developing a software application for a fitness tracking device. Design a
//class to represent an exercise session with fields for type of exercise, duration, and calories
//burned. Implement methods to set and display these details(program).
/*
class exercise{
    String type;
    int duration;
    double caloriesburned;
    public void method(String type,int duration,double caloriesburned){
        this.type=type;
        this.duration=duration;
        this.caloriesburned=caloriesburned;
    }
    public void display(){
        System.out.println(type+" "+duration+" "+caloriesburned);
    }
}
public class ClassandObjects {
    public static void main(String[] args) {
      exercise e =new exercise();
      e.method("zumba",2,340);
      e.display();
    }
}
 */
//What is the significance of the this keyword in Java? Provide an example demonstrating
//its use in a class representing a restaurant order, where the class includes fields for the dish
//name, quantity, and special instructions (theory and example program).
/*
class Restaurantorder{
    private String name;
    private int quantity;
    private String specialinstructions;
    public Restaurantorder(String name,int quantity,String specialinstructions){
        this.name=name;
        this.quantity=quantity;
        this.specialinstructions=specialinstructions;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getSpecialinstructions(){
        return specialinstructions;
    }
    public void getRestaurantDetails(){
        System.out.println(getName()+" "+getQuantity()+" "+getSpecialinstructions());
    }

}
public class ClassandObjects {
    public static void main(String[] args) {
         Restaurantorder rs=new Restaurantorder("noodles",20,"no egg");
         rs.getRestaurantDetails();
    }
    }
 */
//Consider a scenario where you need to model an online shopping cart. Design a class
//representing a shopping cart item, with fields for item name, price, and quantity. Implement
//methods to calculate the total cost of the items in the cart and to apply discounts. Show how
//constructors can be used to initialize the objects and how encapsulation can protect the data
//integrity (program).
/*
class OnlineShoppingCart{
   private String itemname;
   private double price;
   private int quantity;

   public OnlineShoppingCart(String itemname,double price,int quantity){
       this.itemname=itemname;
       this.price=price;
       if(price>=0) {
           this.quantity = quantity;
       }else{
           System.out.println("invalid price");
       }
   }
   public void setPrice(double price){
       if(price<0){
           System.out.println("not valid price");
       }else{
           this.price=price;
       }
   }
   public void setQuantity(int quantity){
       if(quantity<=0) {
           System.out.println("invalid quantity");
       }
       this.quantity = quantity;

   }
   public void getDetails(){
       System.out.println("item name "+getItemname());
       System.out.println(" price "+getPrice());
       System.out.println(" quantity "+getQuantity());

   }
   public  double discountcalculate(int discount){
       if (discount < 0 || discount > 100) {
           System.out.println(" discount not applied");
           return this.calculateCost();
       }
       double totalcost=(discount/100)*calculateCost();
       return this.calculateCost()-totalcost;
   }
   public double calculateCost(){
      return price*quantity;
   }

    public String getItemname() {
        return itemname;
    }
    public double getPrice() {
            return price;
    }
    public  int getQuantity(){
       return quantity;
    }
    public void displayItemDetails() {
        System.out.println("Item Name: " + itemname);
        System.out.println("Price per Unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateCost());
    }
}
public class ClassandObjects {
    public static void main(String[] args) {
         //OnlineShoppingCart osc=new OnlineShoppingCart("rice",60,23);

     OnlineShoppingCart osc=new OnlineShoppingCart("rice",60,23);

        System.out.println("entered list: ");
        System.out.println(osc.getItemname());
        System.out.println(osc.getPrice());
        System.out.println(osc.getQuantity());

        System.out.println();

        System.out.println("bill: ");
        System.out.println(osc.discountcalculate(20));
        System.out.println();


        System.out.println("bill: ");
        osc.setPrice(-8);
        osc.setQuantity(3);
        osc.displayItemDetails();

        System.out.println(osc.discountcalculate(20));
    }
    }

 */
//. Explain the concept of a class in Java and how it serves as a blueprint for objects. Provide
//an example of a class representing a book with attributes for title, author, and number of
//pages(theory and example program).
class Book{
    private String title;
    private String author;
    private int pages;
    public Book(){
        title="unknown title";
        author="unknown author";
        pages=0;
    }
    public Book(String title,String author,int pages){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPages(int pages){
        this.pages=pages;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public int getPages() {
        return pages;
    }
    public void getDetails(){
        System.out.println(getTitle());
        System.out.println(getAuthor());
        System.out.println(getPages());
    }
}
public class ClassandObjects {
    public static void main(String[] args) {
         Book b=new Book();
        // b.getDetails();
      //  Book b1=new Book("MAhatma","gandi",2);
      //  b1.getDetails();
        b.setAuthor("xyz");
        b.setTitle("waste");
        b.setPages(4);
        b.getDetails();


    }
    }