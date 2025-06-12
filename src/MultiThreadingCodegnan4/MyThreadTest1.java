package MultiThreadingCodegnan4;

public class MyThreadTest1 {
    public static void main(String[] args) {
        MyThread1 deva=new MyThread1("roll no");
        deva.start();
        MyThread1 datta=new MyThread1("plzz take roll no");
        datta.start();
    }
}
