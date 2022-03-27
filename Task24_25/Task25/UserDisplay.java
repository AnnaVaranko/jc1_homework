package Task24_25.Task25;

import java.util.Scanner;

public class UserDisplay {
    FinishOperation fo;

    private int userChoice;
    private String yourFirstChoice;

    public UserDisplay() {
        this.fo = new FinishOperation();
    }

    public void numberOfBanknotes(int twenty, int fifty, int hundred) {
        System.out.println("In ATM there are:" +
                "\n\t\tbanknotes 20, quantity: " + twenty +
                "\n\t\tbanknotes 50, quantity: " + fifty +
                "\n\t\tbanknotes 100, quantity: " + hundred);
    }

    private void choiceOfOperation(){
        Scanner firstChoice = new Scanner(System.in);

        System.out.println("\nWould you like: " +
                "\n\t1.Deposit money into account;" +
                "\n\t2.Withdraw money from account." +
                "\nIf you want deposit money into account enter number 1,\n" +
                "or withdraw money from account enter number 2.");
        yourFirstChoice = firstChoice.nextLine();
    }

    public void checkChoiceOfOperation() {
        choiceOfOperation();

        if (yourFirstChoice.equals("1")) {
            userChoice = 1;
        } else if (yourFirstChoice.equals("2")) {
            userChoice = 2;
        } else {
            userChoice = -1;
        }
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void outputNumberBanknotesDM(int amount20, int amount50, int amount100) {

        System.out.println("In ATM there are:\n" +
                "\n\t\tbanknotes 20, quantity: " + amount20 +
                "\n\t\tbanknotes 50, quantity: " + amount50 +
                "\n\t\tbanknotes 100, quantity: " + amount100);

    }

    public void outputNumberBanknotesWithdrawMoney(int valueTwenty, int valueFifty,
                                                   int valueHundred, int inputSum) {
//        // if in ATM valueTwenty, valueFifty or valueHundred == 0 ?
//        if(inputSum <= 0){
//            System.out.println("Incorrect input");
//        }



    }

    public void inputSum(int inputSum) {
        System.out.println("ATM can't approve this sum of money: " + inputSum + ". Cause of in ATM" +
                "\nthere are banknotes denomination 20, 50, 100.");
        System.out.println("\nATM can approve this sum of money: " + (inputSum + 10) + ". Continue?\n");
    }

    public void choiceDenominationBanknotes() {
        System.out.println("This ATM takes banknotes with denominations: 20, 50, 100." +
                "\nWould you like to add banknotes with denominations:" +
                "\n\t1. 20;" +
                "\n\t2. 50;" +
                "\n\t3. 100. " +
                "\n\nIf you want to add banknotes with denominations 20 enter 1," +
                "50 enter 2, 100 enter 3");
    }

    public void incorrectInput() {
        System.out.println("Incorrect input.");
    }

    public void successfulOperation() {
        System.out.println("Operation was successful");
    }
}
