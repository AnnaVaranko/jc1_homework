package task12_23;

import java.math.BigInteger;

public class Task13 {
    public static void factorialOfTwentyFive(){
        BigInteger number = BigInteger.ONE;
        byte i = 1;

        do{
            number = number.multiply(BigInteger.valueOf(i));
            i++;
        } while (i < 26);
        System.out.println(number);
    }
    public static void main(String[] args) {
        factorialOfTwentyFive();
    }
}
