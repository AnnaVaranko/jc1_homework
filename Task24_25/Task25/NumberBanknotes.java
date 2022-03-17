package Task24_25.Task25;

public class NumberBanknotes {
    private int valueTwenty = 0;
    private int valueFifty = 0;
    private int valueHundred = 0;

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
