package Task24_25.Task25;

import java.util.Scanner;

public class DepositMoney {

    private int countTwenty = 0;
    private int countFifty = 0;
    private int countHundred = 0;

    Scanner scanner = new Scanner(System.in);

    String choice;
    String banknote;

    FinishOperation fo;

    public DepositMoney() {
        this.fo = new FinishOperation();
    }

    public void depositMoney() {
        while (fo.getFinishOperation()){
            choiceDenomination();
            fo.IsOperationFinished();

        }
    }

    private void choiceDenomination() {
        System.out.println("This ATM takes banknotes with denominations: 20, 50, 100." +
                "\nWould you like to add banknotes with denominations:" +
                "\n\t1. 20;" +
                "\n\t2. 50;" +
                "\n\t3. 100. " +
                "\n\nIf you want to add banknotes with denominations 20 enter 1," +
                "50 enter 2, 100 enter 3");

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
                System.out.println("Incorrect input.");
                break;
        }
    }

    private void addMoneyInATM() {
        if (choice.equals("1")) setCountTwenty();
        else if (choice.equals("2")) setCountFifty();
        else if (choice.equals("3")) setCountHundred();
    }

    private void setCountTwenty() {
        inputNumberBanknotes20();
        if (banknote.matches("\\d+")){
            countTwenty = countTwenty + Integer.parseInt(banknote);
        }
        else{
            System.out.println("Incorrect input");
            countTwenty = countTwenty + 0;
        }
    }

    private String inputNumberBanknotes20() {
        System.out.println("Input number of banknotes with denominations 20: ");
        return banknote = scanner.nextLine();
    }

    private void setCountFifty() {
        inputNumberBanknotes50();
        if (banknote.matches("\\d+")){
            countFifty =  countFifty + Integer.parseInt(banknote);
        }
        else{
            System.out.println("Incorrect input");
            countFifty = countFifty + 0;
        }
    }

    private String  inputNumberBanknotes50() {
        System.out.println("Input number of banknotes with denominations 50: ");
        return banknote = scanner.nextLine();
    }



    private void setCountHundred() {
        inputNumberBanknotes100();
        if (banknote.matches("\\d+")){
            countHundred = countHundred + Integer.parseInt(banknote);
        }
        else{
            System.out.println("Incorrect input");
            countHundred = countHundred + 0;
        }
    }

    private String inputNumberBanknotes100() {
        System.out.println("Input number of banknotes with denominations 100: ");
        return banknote = scanner.nextLine();
    }

    public int getCountTwenty() {
        return countTwenty;
    }

    public int getCountFifty() {
        return countFifty;
    }

    public int getCountHundred() {
        return countHundred;
    }
}
