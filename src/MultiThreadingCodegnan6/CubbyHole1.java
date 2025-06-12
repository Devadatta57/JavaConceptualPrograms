package MultiThreadingCodegnan6;

public class CubbyHole1 {

    private boolean available=false;
    private int item=0;

    public int getItem(){
        if(available==false){
            try {
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        available=false;
        notifyAll();
        return item;
    }

    public void putItem(int i){
        if(available==true){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        item=i;
        available=true;
        notifyAll();
    }
}
