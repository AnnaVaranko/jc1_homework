package task39_45.task40;

import task39_45.task39.CreateArrayList;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyCollection {

    private int size;
    private final CreateArrayList arrayList;
    private ArrayList<Integer> randomNumber;
    private final Logger log = Logger.getLogger("MyCollection");

    MyCollection(){
        this.arrayList = new CreateArrayList();
        this.randomNumber = new ArrayList<>();
    }

    protected void getArrayList() {
        arrayList.setSizeOfList();
        size = arrayList.getSize();

        if(arrayList.checkInput()) {
            createArrayList();
            checkNumber();
        }
    }

    private void createArrayList() {

        System.out.println("Initial array list: ");

        for(int i = 0; i < size; i++){

            int note = (int)(Math.random() * 10 + 1);
            randomNumber.add(i, note);
            System.out.print(randomNumber.get(i) + " ");
        }
        System.out.println();
    }

    private void checkNumber() {

        for (int i = 0; i < randomNumber.size(); i++) {

            if (i == randomNumber.size() - 1) {
                continue;
            }

            for (int j = i + 1; j < randomNumber.size(); j++) {

                int number = randomNumber.get(i);
                int number2 = randomNumber.get(j);

                if (number == number2) {
                    randomNumber.remove(j);
                    j = i + 1;
                } else {
                    //log.log(Level.INFO, "not in if");
                }
            }
        }
        getNewArray();
    }

    private void getNewArray(){
        System.out.println("\nNew list array: ");

        for(Integer integer : randomNumber)
            System.out.print(integer + " ");
    }
}
