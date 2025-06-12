package MultiThreadingCodegnan6;

public class CubbyHole {
    private boolean available=false;
    private int item=0;

    //consumer call get-waits if no availability-gets if available
    public int getItem(){
        if(available==false){
            try {
                wait();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        //if there is an item
        //wakesup the producer if there is item,before taking item make available=false becoz item is taken out
        available=false;
        notifyAll();//waking up producer by consumer
        return  item;
    }
    //producer calls put-if there is an then producer has to wait ,if item is not there then producer put item
    public void putItem(int i){
          if(available==true){
              try{
                  wait();
              }
              catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
          //if there is no item
          item=i;//producer puts item
          available=true;//item kept so available true
          notifyAll();//waking up consumer by producer
    }
}
