package task4_11;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        int userNumber;

        System.out.println("How much money do you have? Enter the integer:");
        Scanner read = new Scanner(System.in);
        userNumber = read.nextInt();

        if (userNumber % 100 == 0)
            System.out.println("У вас есть " + userNumber + " рублей");
        else if (userNumber % 100 == 1)
            System.out.println("У вас есть " + userNumber + " рубль");
        else if (userNumber % 100 > 1 && userNumber % 100 <= 4)
            System.out.println("У вас есть " + userNumber + " рубля");
        else if (userNumber % 100 > 4 && userNumber % 100 <= 20)
            System.out.println("У вас есть " + userNumber + " рублей");
        else if (userNumber % 10 == 1) System.out.println("У вас есть " + userNumber + " рубль");
        else if (userNumber % 10 > 1 && userNumber % 10 <= 4)
            System.out.println("У вас есть " + userNumber + " рубля");
        else if (userNumber % 10 > 4 && userNumber % 10 <= 9)
            System.out.println("У вас есть " + userNumber + " рублей");
    }
}
