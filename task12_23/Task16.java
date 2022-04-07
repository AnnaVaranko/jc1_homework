package task12_23;

public class Task16 {
    public static void outputPhrase(){
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0){
                System.out.println("Number is " + i);
                System.out.println("Hope!");
            }
        }
    }

    public static void main(String[] args) {
        outputPhrase();
    }
}
