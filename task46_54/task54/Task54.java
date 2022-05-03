package task46_54.task54;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task54 {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 5; i++){
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1_000);
        }
    }
}

class MyThread extends Thread{

    private int[] arr = new int[10];

    @Override
    public void run() {

        try (DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream
                (new FileOutputStream("number")))
        ){
            getArray();
            writeFile(dataOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getArray(){
        for(int i = 0; i < 10; i++){
            arr[i] = (int) (Math.random() * 20 + 1);
//            System.out.print(arr[i] + " ");
        }
    }

    private void writeFile(DataOutputStream dataOut) throws IOException {

        for (int i = 0; i < 10; i++) {
            dataOut.writeInt(arr[i]);
        }
    }
}