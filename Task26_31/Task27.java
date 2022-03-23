package Task26_31;

import java.util.Arrays;
import java.util.Scanner;

public class Task27 {
    public void getArray(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.replaceAll(" +", " ");

        if(str2.charAt(0) == ' '){
            String str3 = str2.substring(1);

            String arr = Arrays.toString(str3.split(" "));
            System.out.println("Array: " + arr);
        } else{
            String arr = Arrays.toString(str2.split(" "));
            System.out.println("Array: " + arr);
        }
    }
    public static void main(String[] args) {
        new Task27().getArray();
    }
}
