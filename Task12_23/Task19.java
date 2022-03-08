package Task12_23;

public class Task19 {
    public void getNumber() {
        int[] numbers = {23, 15, 11, 9, 4, 45, 16, 85, 3, 10};
        for (int i = 0; i < numbers.length; i++){
            if(i % 2 == 0)
                System.out.println("Numbers[" + i + "] - " + numbers[i]);
        }
    }

    public static void main(String[] args) {
        new Task19().getNumber();
    }
}
