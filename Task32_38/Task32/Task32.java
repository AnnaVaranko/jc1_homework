package Task32_38.Task32;

public class Task32 {
    public static void main(String[] args) {
        TelevisionLGMini lgMini = new TelevisionLGMini();
        TelevisionLGMax lgMax = new TelevisionLGMax();

        lgMini.setTurnOn(true);
        lgMini.msgIsTurnOn();

        lgMax.setTurnOn(false);
        lgMax.msgIsTurnOn();
    }
}
