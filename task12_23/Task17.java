package task12_23;

import java.util.Scanner;

public class Task17 {
    public String getNumber() {
        int count = 0;
        String str = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input correct number:");
        long number = scanner.nextInt();
        
        while (number != 0) {
            str = (number % 10) + str;
            count++;
            number /= 10;
            if(count == 3){
                str = " " + str;
                count = 0;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new Task17().getNumber());
    }
}
