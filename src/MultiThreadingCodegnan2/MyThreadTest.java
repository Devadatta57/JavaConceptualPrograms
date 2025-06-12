package MultiThreadingCodegnan2;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        m1.setName("nobita");
        MyThread m2=new MyThread();
        m2.setName("doraemon");
        MyThread m3=new MyThread();
        m3.setName("suzuki");


        m1.start();
        m2.start();
        m3.start();

    }
}
