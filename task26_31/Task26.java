package task26_31;

import java.util.Scanner;

public class Task26 {
    public void findPunctuation(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if(str == "null") {
            System.out.println("Incorrect input");
            return;
        }

        int count = 0;
        char symbol;

        for(int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '.' || symbol == '?' || symbol == '!' || symbol == ':' || symbol == ';' || symbol == '-' ||
                    symbol == ',')
                count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        new Task26().findPunctuation();
    }
}
