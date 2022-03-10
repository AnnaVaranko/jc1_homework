package Task12_23;

public class Task12 {
    public static void getFactorial(){
        int factorial = 0;
        for (int i = 0; i < 11; i++){
            factorial *= i;
            if (factorial == 0) {
                System.out.println("Factorial " + i + " is: 1"); 
                factorial++;
            }
            System.out.println("Factorial " + i + " is: " + factorial);
        }
    }
    public static void main(String[] args) {
        getFactorial();
    }
}
