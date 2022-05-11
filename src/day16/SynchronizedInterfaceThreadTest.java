package day16;

import static java.lang.Thread.sleep;

public class SynchronizedInterfaceThreadTest {
    public static void main(String[] args) {
        Thread2 thread = new Thread2();
        Thread win1 = new Thread(thread);
        Thread win2 = new Thread(thread);
        Thread win3 = new Thread(thread);
        win1.setName("窗口一");
        win2.setName("窗口二");
        win3.setName("窗口三");
        win1.start();
        win2.start();
        win3.start();
    }
}

class Thread2 implements Runnable{
    private static int count = 1000;
    public void run(){
        while(true){
            synchronized (Thread2.class) {
                if (count > 0) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票");
                    count--;
                } else {
                    break;
                }
            }
        }
    }
}
