package Task24_25.Task25;

public class NumberBanknotes {
    private final int valueTwenty;
    private final int valueFifty;
    private final int valueHundred;

    NumberBanknotes(int twenty, int fifty, int hundred) {

        valueTwenty = twenty;
        valueFifty = fifty;
        valueHundred = hundred;
    }

    public int getValueTwenty(){
        return valueTwenty;
    }
    public int getValueFifty(){
        return valueFifty;
    }
    public int getValueHundred(){
        return valueHundred;
    }

}
