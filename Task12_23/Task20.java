package Task12_23;

public class Task20 {
    public static void gerMaxNumber(){
        int maxNumber = 0;
        int index = 0;

        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 0);
            System.out.print(numbers[i] + " ");
        }
        for(int i = 0; i < numbers.length ;i++){
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
                index = i;
            }
        }
        System.out.println("\nArray element index is " + index);
    }

    public static void main(String[] args) {
        gerMaxNumber();
    }
}
