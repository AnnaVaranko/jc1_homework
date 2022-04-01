package Task26_31;

import java.util.Scanner;

public class Task30 {

    public static void findATeg(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");

        String line = scanner.nextLine();

        System.out.println("\nNew line:");
        System.out.println(line.replaceAll("<p.*?>", "<p>"));

    }

    public static void main(String[] args) {
        findATeg();
    }
}
