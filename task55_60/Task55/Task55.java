package task55_60.Task55;

public class Task55 {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}

class MyThread extends Thread{

    private static int count = 1;

    @Override
    public void run() {
        try {
            getThreadName();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized void getThreadName() throws InterruptedException {
        System.out.println("Thread name: thread" + count);

        count++;

        Thread.sleep(2_000);
    }
}
