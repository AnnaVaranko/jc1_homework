package task4_11;

public class Task6 {
    int number;

    public boolean getBoolean(int number) {
        this.number = number % 10;
        return this.number == 7;

    }

    public static void main(String[] args) {
        System.out.println(new Task6().getBoolean(125));
    }
}
