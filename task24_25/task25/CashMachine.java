package task24_25.task25;

public class CashMachine {
    private final UserDisplay userDisplay;
    private final NumberBanknotes nb;
    private final DepositMoney dm;
    private final WithdrawMoney wm;

    public CashMachine() {
        this.userDisplay = new UserDisplay();
        this.nb = new NumberBanknotes(999999999, 335, 213);
        this.dm = new DepositMoney();
        this.wm = new WithdrawMoney();
    }


    public void work() {
        checkBanknotes();
        userDisplay.fullSumInATM(nb.sumOfMoneyInCashMachine());
        userDisplay.checkChoiceOfOperation();
        chosenOperation(userDisplay.getUserChoice());
    }

    private void checkBanknotes(){
        userDisplay.numberOfBanknotes(nb.getValueTwenty(), nb.getValueFifty(), nb.getValueHundred());
    }

    public void chosenOperation(int choice) {
        if(choice == 1){
            dm.depositMoney();
            dm.outputNumberBanknotesDepositMoney(nb.getValueTwenty(), nb.getValueFifty(), nb.getValueHundred());
        }
        else if(choice == 2) {
            wm.withdrawMoney();
            wm.toGiveMoney(nb.getValueTwenty(), nb.getValueFifty(),
                    nb.getValueHundred());
        }
        else if(choice == -1) userDisplay.incorrectInput();
    }
}
