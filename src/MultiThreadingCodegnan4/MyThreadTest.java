package MultiThreadingCodegnan4;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread deva=new MyThread("roll no");
        deva.start();

        MyThread datta=new MyThread("plzz take system");
        datta.start();
    }
}
