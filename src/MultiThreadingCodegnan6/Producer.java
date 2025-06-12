package MultiThreadingCodegnan6;
//both producer and consumer depends on same obj-cubbyhole so create obj for cubbyhole
public class Producer extends Thread{
    CubbyHole cb;
    //vaule initialised to cubbyhole to constructor
    public Producer(CubbyHole cb){
        this.cb=cb;
    }

    @Override
        public void run(){
            for(int i=1;i<=10;i++){
                System.out.println("Item "+i+" put in cubbyhole by waking up consumer");
                //consumer should get a chance so interrupt it  by thread so that consumer gets chance after producer
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }


}
