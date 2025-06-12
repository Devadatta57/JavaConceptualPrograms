package MultiThreadingCodegnan5;

public class ReservationTest1 {
    public static void main(String[] args) {
        Reservation r=new Reservation(1);
        Thread t=new Thread(r);
        t.setName("anand");
        Thread t1=new Thread(r);
        t1.setName("ayesha");
        Thread t2=new Thread(r);
        t2.setName("sravani");

        t1.start();
        t2.start();
        t.start();
    }
}
