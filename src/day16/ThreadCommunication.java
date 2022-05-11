package day16;

import java.text.BreakIterator;

public class ThreadCommunication {
    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        Thread t1 = new Thread(thread3);
        Thread t2 = new Thread(thread3);
        t1.start();
        t2.start();
        t1.setName("线程一");
        t2.setName("线程二");
    }
}

class Thread3 implements Runnable{
    private static int count = 100;
     public void run(){
         while(true) {
             synchronized (this) {
                 notify();
                 if (count > 0) {
                     System.out.println(Thread.currentThread().getName() + count);
                     count--;
                 }
                 try {
                     wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
     }
}
