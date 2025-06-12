package MultiThreadingCodegnan6;
//first create obj of cubbyhole becoz both consumer and producer depends on  cubbyhole obj
public class CubbyHoleTest {
    public static void main(String[] args) {

        CubbyHole cb=new CubbyHole();
        Producer p=new Producer(cb);//producer and consumer are threads here
        Consumer c=new Consumer(cb);

        p.start();
        c.start();
    }
}
