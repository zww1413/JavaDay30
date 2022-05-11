package day15;

public class RunnableThreadTest {
    public static void main(String[] args) {
        NewThread1 newThread = new NewThread1();
        Thread thread1 = new Thread(newThread);
        Thread thread2 = new Thread(newThread);
        thread1.start();
        thread2.start();
        thread1.setName("线程一");
        thread2.setName("线程二");

    }
}

class NewThread1 implements Runnable{
    static int i;
    public void run(){
        for (i = 0;i < 100; i++){
            System.out.println(Thread.currentThread().getName()+  i);
        }
    }
}