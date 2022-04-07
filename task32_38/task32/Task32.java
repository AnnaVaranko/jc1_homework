package task32_38.task32;

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
