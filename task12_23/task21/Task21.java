package task12_23.task21;

public class Task21 {
    public static int[] getSumElementsArray(){

        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 0);
            System.out.print(numbers[i] + " ");
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("Elements array are ");
        FindMaxAndMinNumbers myNumbers = new FindMaxAndMinNumbers();
        System.out.println( "Sum of number between max and min elements array: " +
                myNumbers.getMaxAndMinNumbers(getSumElementsArray()));
    }
}
