package MultiThreadingCodegnan3;

public class RunnableInterfaceTest1 {
    public static void main(String[] args) {
        Runnableinterface1 r=new Runnableinterface1();
        Thread t=new Thread(r);
        t.start();
    }
}
