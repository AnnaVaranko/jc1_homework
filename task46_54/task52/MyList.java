package task46_54.task52;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyList {

    private static List<Integer> list;
    private double sum;

    public MyList() {
        list = new CopyOnWriteArrayList<>();
    }

    protected synchronized void writeArrayList() {

        System.out.println("Initial array list: ");

        for(int i = 0; i < 10; i++){

            int note = (int)(Math.random() * 10 + 1);
            list.add(i, note);
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    protected synchronized double average(){
        int count = 0;

        for (int number : list) {
            sum += number;
            count++;
        }
        return sum/count;
    }
}
