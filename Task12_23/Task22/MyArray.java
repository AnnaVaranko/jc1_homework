package Task12_23.Task22;

public class MyArray {
    int[] numbers = new int[10];
    public MyArray(){
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 0);
            System.out.print(numbers[i] + " ");
        }
    }
}
