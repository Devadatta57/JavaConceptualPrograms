package MultiThreadingCodegnan6;

public class Consumer extends Thread{
    //consumer also depends on cubbyhole create obj to use it and initialize value through it
    CubbyHole cb;
    public Consumer(CubbyHole cb){
        this.cb=cb;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("item " + i + " taken out  from consumer by waking up producer");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
