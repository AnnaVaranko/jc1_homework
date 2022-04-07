package task12_23;

public class Task14 {
    public static int getSum(){
        int sum = 0;
        int restOfNumber;
        long number = 7_893_823_445L;

        do{
            restOfNumber =(int)(number % 10);
            sum += restOfNumber;
            number /= 10;
        } while (number != 0);

        return sum;

    }
    public static void main(String[] args) {
        System.out.println("Sum of number 7_893_823_445: " + getSum());
    }
}
