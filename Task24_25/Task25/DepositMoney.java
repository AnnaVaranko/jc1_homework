package Task24_25.Task25;

import java.util.Scanner;

public class DepositMoney {

    private final UserDisplay userDisplay;
    private int countTwenty = 0;
    private int countFifty = 0;
    private int countHundred = 0;

    Scanner scanner = new Scanner(System.in);

    String choice;
    String banknote;

    FinishOperation fo;

    public DepositMoney() {
        this.fo = new FinishOperation();
        this.userDisplay = new UserDisplay();
    }

    public void depositMoney() {
        while (fo.getFinishOperation()){
            choiceDenomination();
            fo.IsOperationFinished();
        }
    }

    private void choiceDenomination() {
        userDisplay.choiceDenominationBanknotes();
        choice = scanner.nextLine();
        checkInput();
    }

    private  void checkInput(){
        switch (choice) {
            case "1":
            case "2":
            case "3":
                addMoneyInATM();
                break;
            default:
                userDisplay.incorrectInput();
                break;
        }
    }

    private void addMoneyInATM() {
        switch (choice) {
            case "1":
                setCountTwenty();
                break;
            case "2":
                setCountFifty();
                break;
            case "3":
                setCountHundred();
                break;
        }
    }

    private void setCountTwenty() {
        inputNumberBanknotes20();
        if (banknote.matches("\\d+")){
            countTwenty = countTwenty + Integer.parseInt(banknote);
            userDisplay.successfulOperation();
        }
        else{
            userDisplay.incorrectInput();
//            countTwenty = countTwenty;
        }
    }

    private void inputNumberBanknotes20() {
        //TODO: if number too long
        System.out.println("Input number of banknotes with denominations 20: ");
        banknote = scanner.nextLine();
    }

    private void setCountFifty() {
        inputNumberBanknotes50();
        if (banknote.matches("\\d+")){
            countFifty =  countFifty + Integer.parseInt(banknote);
            userDisplay.successfulOperation();
        }
        else{
            userDisplay.incorrectInput();
//            countFifty = countFifty;
        }
    }

    private void inputNumberBanknotes50() {
        //TODO: if number too long
        System.out.println("Input number of banknotes with denominations 50: ");
        banknote = scanner.nextLine();
    }

    private void setCountHundred() {
        inputNumberBanknotes100();
        if (banknote.matches("\\d+")){
            countHundred = countHundred + Integer.parseInt(banknote);
            userDisplay.successfulOperation();
        }
        else{
            userDisplay.incorrectInput();
//            countHundred = countHundred;
        }
    }

    private void inputNumberBanknotes100() {
        //TODO: if number too long
        System.out.println("Input number of banknotes with denominations 100: ");
        banknote = scanner.nextLine();
    }

    public void outputNumberBanknotesDepositMoney(int twenty, int fifty, int hundred) {
        int amount20 = twenty + countTwenty;
        int amount50 = fifty + countFifty;
        int amount100 = hundred + countHundred;
        userDisplay.outputNumberBanknotesDM(amount20, amount50, amount100);
    }
}
