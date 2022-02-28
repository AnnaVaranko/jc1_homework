package Task3_11;

public class Task4 {
    long number;

    public long getLong(int firstNumber, int secondNumber) {
        number = firstNumber + secondNumber + (firstNumber * secondNumber);
        return number;
    }

    public static void main(String[] args) {
        System.out.println(new Task4().getLong(121, 1545));
    }
}
