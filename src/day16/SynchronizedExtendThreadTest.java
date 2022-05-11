package day16;

public class SynchronizedExtendThreadTest {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        Thread1 thread3 = new Thread1();
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Thread1 extends Thread {
    public static int count = 1000;
    private static Object obj = new Object();

    public void run() {
        while(true){
        synchronized (obj) {
            if(count > 0){
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"卖出第"+count+"张票");
                count--;
            }else{
                break;
            }
            }
        }
    }
}


