package logicalprogramspractice;
//
//class MyThread extends Thread{
//    public void start(){
//        super.start();
//        System.out.println("overided start");
//    }
//    public void run(){
//        System.out.println("run method overided");
//    }
//}
//public class multiThreadingrr {
//    public static void main(String[] args) {
//        MyThread m=new MyThread();
//        m.start();
//    }
//}


class MyThread implements Runnable{
    @Override
     public void run(){
           System.out.println("run overrided");

     }
}
public class multiThreadingrr {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        Thread.currentThread().setName("devadatta");
        System.out.println(Thread.currentThread().getName());
        Thread t=new Thread(m);
        t.start();

    }
}
