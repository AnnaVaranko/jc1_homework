package task26_31;

import java.util.Scanner;

public class Task28 {
    public void getLastSymbolInWord(){

        String newLine = "";
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");

        String line = scanner.nextLine();

        if(line == "null") {
            System.out.println("Incorrect input");
            return;
        }

        String str2 = line.replaceAll(" +", " ");
        String str3 = str2.stripLeading();
        System.out.println("Line without extra space: " + str3);

        for(int i = 0; i < str3.length(); i ++){
            symbol = str3.charAt(i);

            if(symbol == ' ') {

                char symbol2 = str3.charAt(i-1);
                if (symbol2 == '.' || symbol2 == '?' || symbol2 == '!' || symbol2 == ':' ||
                        symbol2 == ';' || symbol2 == '-' || symbol2 == ','){
                    newLine = newLine + str3.charAt(i-2);

                } else newLine = newLine + symbol2;
            }
        }

        System.out.println("New line: " + newLine);

    }

    public static void main(String[] args) {
        new Task28().getLastSymbolInWord();

    }
}
