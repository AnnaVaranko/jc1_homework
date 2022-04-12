package task39_45.task45;

import java.io.IOException;
import java.util.InputMismatchException;

public class Task45 {
    public static void main(String[] args) {
        MethodWithException methodWithException = new MethodWithException();

        try{
            methodWithException.methodException();
        } catch (ArithmeticException | InputMismatchException | IOException e){
            e.printStackTrace();
            System.out.println("Finish.");
        }
    }
}
