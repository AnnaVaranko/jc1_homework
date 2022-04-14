package task39_45.task41;

import task39_45.task39.CreateArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FindMaxNumber {

    private int size;
    private final CreateArrayList arrayList;
    private ArrayList<Integer> randomNumber;

    FindMaxNumber(){
        this.arrayList = new CreateArrayList();
        this.randomNumber = new ArrayList<>();
    }

    public void getMaxNumber() {
        arrayList.setSizeOfList();
        size = arrayList.getSize();

        if(arrayList.checkInput()){
            createArrayList();
            maxNumber();
        }
    }

    private void createArrayList() {
        System.out.println("Array list: ");

        for(int i = 0; i < size; i++){

            int note = (int)(Math.random() * 30 + 1);
            randomNumber.add(i, note);
            System.out.print(randomNumber.get(i) + " ");
        }
        System.out.println();
    }

    private int findMaxNumber() {
        Iterator<Integer> iterator = randomNumber.iterator();
        int compare = 0;

        while (iterator.hasNext()){

            int number = iterator.next();
            if(compare <= number) compare = number;
        }
        return compare;
    }

    private void maxNumber(){
        int max = findMaxNumber();
        System.out.println("Max number is " + max);
    }
}
