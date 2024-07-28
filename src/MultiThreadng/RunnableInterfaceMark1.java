package MultiThreadng;
class Thread3 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<100)
        {
            System.out.println("I am Ironman");
            i++;
        }
    }
}
class Thread4 implements Runnable {
    @Override
    public void run() {
        int i=0;
        while(i<100)
        {
            System.out.println("I am Batman");
            i++;
        }
    }
}
public class RunnableInterfaceMark1 {
    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        Thread thread1 = new Thread(thread3);
        Thread4 thread4 = new Thread4();
        Thread thread2 = new Thread(thread4);
        thread1.start();
        thread2.start();
    }
}
