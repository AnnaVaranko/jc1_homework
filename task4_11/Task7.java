package task4_11;

public class Task7 {

    int r, diameterOfCircle;
    double a, b, diameterOfRectangle;

    public String getIfWeCanCloseRectangle(int firstSide, int secondSide, int radius) {
        a = firstSide * firstSide;
        b = secondSide * secondSide;
        diameterOfRectangle = Math.sqrt(a + b);

        r = radius;
        diameterOfCircle = r + r;

        if (diameterOfRectangle <= diameterOfCircle)
            return "Circle's closing rectangle";
        else return "Circle isn't closing rectangle";

    }

    public static void main(String[] args) {
        System.out.println(new Task7().getIfWeCanCloseRectangle(11, 18, 8));
    }
}
