package Task12_23.Task22;

public class NewArray {
    public void getArray() {
        int[] numbers = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 0);
            System.out.print(numbers[i] + " ");
        }
        for(int j = 0; j < numbers.length; j++){
            if (j >= (numbers.length - j - 1)) break;
            int temporary = numbers[j];
            numbers[j] = numbers[numbers.length - j - 1];
            numbers[numbers.length - j - 1] = temporary;
        }
        System.out.print("\nNew array: ");
        for (int index = 0; index < numbers.length; index++){
            System.out.print(numbers[index] + " ");
        }
    }
}
