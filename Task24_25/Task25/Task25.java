package Task24_25.Task25;

public class Task25 {
    private int valueTwentyAfterOperation;
    private int valueFiftyAfterOperation;
    private int valueHundredAfterOperation;

    public void howMuchMoneyInATMPlusDepositMoney(){
        NumberBanknotes nb = new NumberBanknotes(12, 23,79);

        CashMachineDepositMoney dm = new CashMachineDepositMoney();
        valueTwentyAfterOperation = nb.getValueTwenty() + dm.getBanknote20();
        System.out.print("In ATM there are " + valueTwentyAfterOperation + " banknotes with denomination 20.\n");
        valueFiftyAfterOperation = nb.getValueFifty()+ dm.getBanknote50();
        System.out.print("In ATM there are " + valueFiftyAfterOperation + " banknotes with denomination 50.\n");
        valueHundredAfterOperation = nb.getValueHundred() + dm.getBanknote100();
        System.out.print("In ATM there are " + valueHundredAfterOperation + " banknotes with denomination 100.\n");
    }
    public static void main(String[] args) {

        new ChoiceOfOperation().getChoiceOfOperation();
        Task25 aftOp = new Task25();
        aftOp.howMuchMoneyInATMPlusDepositMoney();
    }
}
