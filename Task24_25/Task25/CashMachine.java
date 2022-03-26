package Task24_25.Task25;

public class CashMachine {
    final UserDisplay userDisplay;
    final NumberBanknotes nb;
    final DepositMoney dm;
    final WithdrawMoney wm;

    public CashMachine() {
        this.userDisplay = new UserDisplay();
        this.nb = new NumberBanknotes(12, 54, 756213);
        this.dm = new DepositMoney();
        this.wm = new WithdrawMoney();
    }


    public void work() {
        checkBanknotes();

        userDisplay.checkChoiceOfOperation();
        chosenOperation(userDisplay.getUserChoice());
    }

    public void chosenOperation(int choice) {
        if(choice == 1){
            dm.depositMoney();
            userDisplay.outputNumberBanknotesDepositMoney(nb.getValueTwenty(), nb.getValueFifty(), nb.getValueHundred(),
                    dm.getCountTwenty(), dm.getCountFifty(), dm.getCountHundred());
        }
        else if(choice == 2) {
            wm.withdrawMoney();
            userDisplay.outputNumberBanknotesWithdrawMoney(nb.getValueTwenty(), nb.getValueFifty(),
                    nb.getValueHundred(), wm.getInputSum());
        }
        else if(choice == -1) System.out.println("Incorrect input");
    }


    private void checkBanknotes(){
        userDisplay.numberOfBanknotes(nb.getValueTwenty(), nb.getValueFifty(), nb.getValueHundred());
    }


}
