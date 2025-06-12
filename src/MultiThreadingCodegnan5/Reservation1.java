package MultiThreadingCodegnan5;

public class Reservation1 implements Runnable {
    private int available=2;
    private int wanted;
    public Reservation1(int wanted){
       this.wanted=wanted;
    }
    public void run(){
       String name= Thread.currentThread().getName();
        if(wanted<=available){
            System.out.println("Ticket booked for "+name);
            available=available-wanted;
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("Sorry no tickets for "+name);
        }
    }
}
