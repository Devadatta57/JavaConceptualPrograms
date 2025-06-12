package MultiThreadingCodegnan2;

public class MyThreadTest1 {
    public static void main(String[] args) {
        MyThread deva=new MyThread();
        deva.setName("era");
        MyThread  vanishita=new MyThread();
        vanishita.setName("wera");
        MyThread deepika =new MyThread();
        deepika.setName("book");

        deva.start();
        vanishita.start();
        deepika.start();
    }
}
