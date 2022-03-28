package Task26_31;

public class Task31 {

    private void useClassString(){
        String str = "";
        //Использовала не миллион сложений, а меньше, потому что виснет компьютер
        for(int i = 0; i < 10_000; i++){
            str = str + "aaabbbccc";
        }
    }

    private void useClassStringBuilder(){
        StringBuilder str = new StringBuilder("");
        for(int i = 0; i < 10_000; i++){
            str.append("aaabbbccc");
        }
    }

    public void resultOfCompare(){
        long t1 = System.currentTimeMillis();
        useClassString();
        long t2 = System.currentTimeMillis();
        System.out.println("Runtime of method useClassString(): " + (t2-t1));

        long t3 = System.currentTimeMillis();
        useClassStringBuilder();
        long t4 = System.currentTimeMillis();
        System.out.println("Runtime of method useClassStringBuilder(): " + (t4-t3));
    }

    public static void main(String[] args) {
        new Task31().resultOfCompare();
    }
}
