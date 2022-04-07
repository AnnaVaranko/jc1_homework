package task12_23;

public class Task18 {
    public static void getLastNumber(){
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length;i++)
            numbers[i] = (int)(Math.random()*100+0);
        System.out.println("Last number in array: " + numbers[numbers.length - 1]);
    }

    public static void main(String[] args) {
        getLastNumber();
    }
}
