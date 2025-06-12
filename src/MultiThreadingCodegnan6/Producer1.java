package MultiThreadingCodegnan6;

public class Producer1 implements Runnable{
    CubbyHole1 cb;
    public Producer1(CubbyHole1 cb){
       this.cb=cb;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("put item "+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
