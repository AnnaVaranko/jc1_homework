package Task26_31;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void findAMatch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line: ");

        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("0[xX][A-F0-9]+");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(line.substring(matcher.start(), matcher.end()));
        }
    }

    public static void main(String[] args) {
        findAMatch();
    }
}
