package task39_45.task45;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodWithException {

    public int methodException() throws IOException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");

        int i = scanner.nextInt();

        return i/0;
    }
}
