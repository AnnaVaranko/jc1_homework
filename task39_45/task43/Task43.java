package task39_45.task43;

public class Task43 {
    public static void main(String[] args) {
        Integer int1 = null;
        Integer int2 = 1;
        try{
            int int3 = int1 + int2;
        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        }
    }
}
