package task46_54.task52;

public class task52 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 11; i++){
            MyThread myThread = new MyThread();
            myThread.setName("Thread" + i);
            System.out.println(myThread.getName());
            myThread.start();
            myThread.join();
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        MyList myList = new MyList();
        myList.writeArrayList();
        System.out.println(myList.average());
    }
}