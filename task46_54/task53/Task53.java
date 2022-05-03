package task46_54.task53;

public class Task53 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 11; i++) {
            MyThread myThread = new MyThread();
            myThread.setName("Thread" + i);
            System.out.println(myThread.getName());
            myThread.start();
            Thread.sleep(1_000);
        }
    }
}

class MyThread extends Thread{

    private int[] arr = new int[10];

    @Override
    public void run() {
        getArray();
        System.out.println();
        System.out.println("Max number: " + searchMaxInt());
    }

    private void getArray(){
        for(int i = 0; i < 10; i++){
            arr[i] = (int) (Math.random() * 20 + 1);
//            System.out.print(arr[i] + " ");
        }
    }

    private int searchMaxInt(){
        int firstNumber = arr[0];

        for(int i = 1; i < 10; i++){
            if(firstNumber < arr[i]){
                firstNumber = arr[i];
            }
        }
        return firstNumber;
    }
}