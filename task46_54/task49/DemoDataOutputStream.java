package task46_54.task49;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DemoDataOutputStream {

    private String name;
    int number;
    List<Integer> list;

    public DemoDataOutputStream(String name) {
        this.name = name;
        list = new ArrayList<>(20);
    }

    public void work(){
        writeFile();
        System.out.println();
        readFile();
        System.out.println("\nAverage: " + average());
    }
    private void writeFile(){
        try (DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(name)))){

            for (int i = 0; i < 20; i ++){
                number = (int) (Math.random() * 10 + 1);
                dataOut.writeInt(number);
                System.out.print(number + " ");
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("input/output exception");
        }
    }

    private void readFile() {
        try (DataInputStream dataIn = new DataInputStream(new BufferedInputStream(new FileInputStream(name)))){

            for (int i = 0; i < 20; i ++){
                list.add(dataIn.readInt());
                System.out.print(list.get(i) + " ");
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("input/output exception.");
        }

    }

    private double average(){
        try {
            int sum = 0;
            int count = 0;

            for (int i = 0; i < list.size(); i ++){
                sum = sum + list.get(i);
                count++;
            }
            return (double) sum/count;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
            return -1;
        }
    }
}