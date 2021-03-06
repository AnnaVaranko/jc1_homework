package task39_45.task39;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateArrayList {

    private int size;
    private ArrayList<Integer> scoreBook = new ArrayList<>();

    protected void getArrayList(){
        setSizeOfList();

        if(checkInput()) {
            writeArrayList();
            newArrayList();
        }
    }

    public void setSizeOfList(){
        boolean isTrue = true;

        Scanner scanner = new Scanner(System.in);

        while (isTrue) {
            System.out.println("Enter the size of array smaller than two digit number:");
            String stringSize = scanner.nextLine();

            if (stringSize.matches("[0-9]{1,2}")){
                size = Integer.parseInt(stringSize);
                isTrue = false;
            }
            else {
                System.out.println("Incorrect input. Try again.");
                size = 0;
            }
        }
    }

    public boolean checkInput() {
        boolean isTrue;

        if(size == 0) {
            System.out.println("List is empty.");
            isTrue = false;
        } else {
            isTrue = true;
        }
        return isTrue;
    }

    private void writeArrayList() {

        System.out.println("Initial array list: ");

        for(int i = 0; i < size; i++){

            int note = (int)(Math.random() * 10 + 1);
            scoreBook.add(i, note);
            System.out.print(scoreBook.get(i) + " ");
        }
    }

    private void newArrayList(){

        System.out.println("\nNew array list:");

        for (int i = 0; i < scoreBook.size(); i++){
            int checkNote = scoreBook.get(i);
            if(checkNote < 4){
                scoreBook.remove(i);
                i = 0;
            }
        }

        for (Integer integer : scoreBook) System.out.print(integer + " ");
    }

    public int getSize() {
        return size;
    }
}
