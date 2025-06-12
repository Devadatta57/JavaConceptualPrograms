package MultiThreadingCodegnan4;

public class MyThread1 extends Thread{
       String msg;
    public MyThread1(String msg){
        this.msg=msg;
    }
   public void run(){
       for(int i=0;i<10;i++){
           System.out.println(i+" "+msg);
           try{
               Thread.sleep(1000);
           }
           catch(InterruptedException e){
               e.printStackTrace();
           }
       }
   }

}
