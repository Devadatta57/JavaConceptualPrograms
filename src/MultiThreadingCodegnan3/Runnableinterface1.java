package MultiThreadingCodegnan3;

public class Runnableinterface1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
