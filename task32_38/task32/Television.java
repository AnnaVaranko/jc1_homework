package task32_38.task32;

public class Television {
    private boolean isTurnOn;

    public boolean getIsTurnOn() {
        return isTurnOn;
    }

    public void setTurnOn(boolean turnOn) {
        isTurnOn = turnOn;
    }

    public void msgIsTurnOn(){
        if (isTurnOn) System.out.println("Television is turn on");
        else System.out.println("Television is turn off");
    }
}
