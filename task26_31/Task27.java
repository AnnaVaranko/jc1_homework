package task26_31;

import java.util.Scanner;

public class Task27 {
    public void getArray(){
        int count = 0;
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");
        String str = scanner.nextLine();

        if(str == null) {
            System.out.println("Incorrect input");
            return;
        }

        String str2 = str.replaceAll(" +", " ");
        String str3 = str2.stripLeading();
        System.out.println("Line without extra space: " + str3);
        str2 = str3 + " ";

        if (!str2.equals(" ")) {
            for (int i = 0; i < str2.length(); i++) {
                symbol = str2.charAt(i);
                if (symbol == ' ') count++;
            }
            System.out.println("Number of word in the line: " + count);
        } else System.out.println("In the text there isn't word.");

    }

    public static void main(String[] args) {
        new Task27().getArray();
    }
}
