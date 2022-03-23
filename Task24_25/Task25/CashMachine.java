package Task24_25.Task25;

public class CashMachine {
    final UserDisplay userDisplay;
    final NumberBanknotes nb;
    final DepositMoney dm;
    final WithdrawMoney wm;

    public CashMachine() {
        this.userDisplay = new UserDisplay();
        this.nb = new NumberBanknotes(12, 54, 73);
        this.dm = new DepositMoney();
        this.wm = new WithdrawMoney();
    }


    public void work() {
        checkBanknotes();
        userDisplay.checkChoiceOfOperation();
        chosenOperation(userDisplay.getUserChoice());
        outputNumberBanknotes(nb.getValueTwenty(), nb.getValueFifty(), nb.getValueHundred(),
                dm.getCountTwenty(), dm.getCountFifty(), dm.getCountHundred());
    }

    public void chosenOperation(int choice) {
        if(choice == 1) dm.depositMoney();
        else if(choice == 2) wm.withdrawMoney();
        else if(choice == -1) System.out.println("Incorrect input");
    }

    private void outputNumberBanknotes(int twenty, int fifty, int hundred,
                                       int countTwenty, int countFifty, int countHundred) {
        int amount20 = twenty + countTwenty;
        int amount50 = fifty + countFifty;
        int amount100 = hundred + countHundred;
        System.out.println("In ATM there are:\n" +
                "\t\tbanknotes 20, quantity: " + amount20 +
                "\t\tbanknotes 50, quantity: " + amount50 +
                "\t\tbanknotes 100, quantity: " + amount100);

    }

    private void checkBanknotes(){
        userDisplay.numberOfBanknotes(nb.getValueTwenty(), nb.getValueFifty(), nb.getValueHundred());
    }


}
