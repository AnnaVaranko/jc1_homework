package task39_45.task40;

import task39_45.task39.CreateArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyCollection {

    private int size;
    private final CreateArrayList arrayList;
    private ArrayList<Integer> randomNumber;
    Set<Integer> numberSet;

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
            getNewArray();
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
        Set<Integer> numberSet = new HashSet<>(randomNumber);
    }

    private void getNewArray(){
        System.out.println("\nNew list array: ");

        for(Integer integer : numberSet)
            System.out.print(integer + " ");
    }
}
