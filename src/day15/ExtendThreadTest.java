package day15;

public class ExtendThreadTest {
    public static void main(String[] args) {
        NewThread thread1 = new NewThread();
        NewThread thread2 = new NewThread();
        thread1.setName("线程一");
        thread2.setName("线程二");
        thread1.start();
        thread2.start();
    }
}


class NewThread extends Thread{
    static int i;
    public  void  run(){
                for (i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
        }
    }

