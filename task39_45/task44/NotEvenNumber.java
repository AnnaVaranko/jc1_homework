package task39_45.task44;

public class NotEvenNumber extends Throwable{

    int i;

    public NotEvenNumber(int i) {
        this.i = i;
    }

    public String toString(){
        return "Error: " + "Number " + i + " is not even number";
    }
}
