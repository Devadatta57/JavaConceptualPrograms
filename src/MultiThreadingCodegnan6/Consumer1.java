package MultiThreadingCodegnan6;

public class Consumer1 implements Runnable{
    CubbyHole1 cb;
    public Consumer1(CubbyHole1 cb){
        this.cb=cb;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("get item "+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
