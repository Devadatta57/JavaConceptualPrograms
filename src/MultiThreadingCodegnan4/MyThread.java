package MultiThreadingCodegnan4;
//✅ You need to share the same task across multiple threads.

//using runnable interface instead thread
public class MyThread extends Thread{
    String message;
    public MyThread(String message){
           this.message=message;
    }

    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(message+i);
            //nxt thread will get a chance when one thread goes to sleep
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("exception raised");
            }

        }
    }

}
