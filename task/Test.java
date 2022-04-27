package task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "dg 5 6s5 g 5sg 6";

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            int start = matcher.start();
            System.out.println(start);
            int end = matcher.end();
            System.out.println(end);
        }
    }
}
