package MultiThreadingCodegnan5;

public class ReservationTest {
    public static void main(String[] args) {
      //  Reservation r=new Reservation(1);//one person wants one ticket
        //each thread represents a person
        Reservation r=new Reservation(2);//one person wants two tickets


        Thread t1=new Thread(r,"deva");//2 booked-so no ticket for remaining
        t1.start();

        Thread t2=new Thread(r,"datta");
        t2.start();

        Thread t3=new Thread(r,"eva");
        t3.start();

    }
}
