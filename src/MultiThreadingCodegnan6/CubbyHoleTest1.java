package MultiThreadingCodegnan6;

public class CubbyHoleTest1 {
    public static void main(String[] args) {
        CubbyHole1 cb=new CubbyHole1();
        Producer1 p=new Producer1(cb);
        Consumer1 c=new Consumer1(cb);

        Thread t=new Thread(p);
        Thread t1=new Thread(c);
        t.start();
        t1.start();

    }
}
