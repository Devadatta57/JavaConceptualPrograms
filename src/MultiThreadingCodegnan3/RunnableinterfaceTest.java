package MultiThreadingCodegnan3;

public class RunnableinterfaceTest {
    public static void main(String[] args) {
      Runnableinterface r=new Runnableinterface();
      Thread t=new Thread(r);
      t.start();
    }
}
