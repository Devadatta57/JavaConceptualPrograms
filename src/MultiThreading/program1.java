package MultiThreading;
/*
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("run method overrided in MyThread " + i);
        }
    }
}
public class program1 {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.run();
        for(int i=0;i<10;i++){
            System.out.println("main Thread "+i);
        }
    }
}
 */
//class MyThread extends Thread{
//    public void run(){
//        for(int i=0;i<10;i++){
//            System.out.println("run overided from Thread "+i);
//        }
//    }
//    public void run(int i){
//        for(int j=0;j<10;j++){
//            System.out.println("run overided when overloaded executed from main thread "+j);
//        }
//    }
//}
//public class program1 {
//    public static void main(String[] args) {
//      MyThread t=new MyThread();
//      t.run();
//      t.run(4);
//    }
//    }

//class MyThread extends Thread{
//    public void  start(){
//        System.out.println("start ovrided");
//    }
//    public void run(){
//        System.out.println("run overided in myThread");
//    }
//}
//public class program1 {
//    public static void main(String[] args) {
//        MyThread t=new MyThread();
//        t.start();
//
//    }
//}
//

//class MyThread extends Thread{
//    public void start(){
//        super.start();
//     System.out.println("start mathod overided in start");
//    }
//    public void run(){
//        System.out.println("run overided in myThread");
//    }
//}
//
//public class program1 {
//    public static void main(String[] args) {
//       MyThread t=new MyThread();
//       t.start();
//}
//}


//class MyThread implements Runnable{
//    public void run(){
//        System.out.println("run method in mythread");
//    }
//}
//public class program1 {
//    public static void main(String[] args) {
//        MyThread t=new MyThread();
//        Thread tt=new Thread(t);
//        tt.start();
//    }
//}
//
//class era implements Runnable{
//    public void run(){
//        String name= Thread.currentThread().getName();
//        System.out.println("run() in era "+name);
//    }
//}
//public class program1 {
//   public static void main(String[] args) {
//       String name=Thread.currentThread().getName();
//       System.out.println(name);
//       Thread.currentThread().setName("deva");
//        name=Thread.currentThread().getName();
//       System.out.println(name);
//       era e=new era();
//            //e.run();
//       Thread t=new Thread(e);
//       t.start();
//     }
//     }
//class wera extends Thread{
//    public void run(){
//
//      //  for(int i=0;i<10;i++){
//        Thread.currentThread().setPriority(10);
//            System.out.println(Thread.currentThread().getPriority()+" of wera");
//            System.out.println("run ");
//       // }
//    }
//
//}
//public class program1 {
//       public static void main(String[] args) {
//          wera t=new wera();
//          Thread.currentThread().setPriority(2);
//           System.out.println(Thread.currentThread().getPriority() +" of main");
//          // for(int i=0;i<10;i++){
//               System.out.println("main thread ");
//          // }
//          t.start();
//     }
//}

//class MyThread implements Runnable{
//    public void run() {
//        System.out.println("run() in mythread");
//        try {
//            Thread.sleep(2000);
//        }catch(InterruptedException e){
//            System.out.println("waked up");
//        }
//    }
//}
//public class program1 {
//      public static void main(String[] args) {
//          MyThread m=new MyThread();
//          Thread t=new Thread(m);
//          t.run();
//}
//}

//class MyThread implements Runnable{
//    public void run() {
//        System.out.println("run() in mythread");
//        try {
//            Thread.sleep(2000);
//        }catch(InterruptedException e){
//            System.out.println("waked up");
//        }
//    }
//}
//public class program1 {
//    public static void main(String[] args) {
//        MyThread m=new MyThread();
//        Thread t=new Thread(m);
//        t.start();
//
//        t.interrupt();//main thread completes its execution run() executed and slept completed,so after execution interrupts does nothing
//    }
//}

//class MyThread implements Runnable {
//    public void run() {
//        for (int i = 0; i <10; i++) {
//            System.out.println(Thread.currentThread().getName()+"  is thread name in run");
//            System.out.println("run() in mythread");
////            try {
////                Thread.sleep(2000);
////            } catch (InterruptedException e) {
////                System.out.println("waked up");
////            }
//        }
//    }
//}
//public class program1 {
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()+"  is thread name in main method");
//        MyThread m=new MyThread();
//        Thread t=new Thread(m);
//        System.out.println(Thread.currentThread().getName()+"  is thread name after Thread obj created");
//        t.start();
//        System.out.println(Thread.currentThread().getName()+"  is thread name after start created");
//
//        t.interrupt();
//    }
//}

//for understanding purpose
//
//public class Main {
//    public static void main(String[] args) {
//        MyThread obj = new MyThread(); // Just an object, NOT a thread
//        Thread t = new Thread(obj);    // Still NOT a thread, just an object
//        t.start();                     // NOW a new thread is created and run() executes
//    }
//}

//class Student{
//    public int method() {
//        int a = 15;
//        int b = 0;
//        try {
//            int c = a / b;
//            return 10;//if exception occurs this statement uncreachable ctrl goes to catch block so return in catch block if execption case
//        } catch (ArithmeticException e) {
//           System.out.println("exception ");
//           return 10;
//        }
//        finally{
//            System.out.println("connection terminated");//finally dominated and exectuted even return
//        }
//    }
//
//
//}
//public class program1{
//    public static void main(String[] args) {
//         Student s=new Student();
//         s.method();
//    }
//}
