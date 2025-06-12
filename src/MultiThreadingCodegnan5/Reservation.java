package MultiThreadingCodegnan5;

public class Reservation implements Runnable {
    private int available=2;
    private int wanted;
    public Reservation(int wanted){
        this.wanted=wanted;
    }
    @Override
    public synchronized  void run(){
        String name=Thread.currentThread().getName();
        if(wanted<=available){
            System.out.println("ticket booked for "+name);
            available=available-wanted;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Sorry not booked for "+name);
        }
    }

}
