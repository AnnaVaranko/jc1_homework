package task24_25.task25;

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

    private void choiceOfOperation(){
        Scanner firstChoice = new Scanner(System.in);

        System.out.println("\nWould you like: " +
                "\n\t1.Deposit money into account;" +
                "\n\t2.Withdraw money from account." +
                "\nIf you want deposit money into account enter number 1,\n" +
                "or withdraw money from account enter number 2.");
        yourFirstChoice = firstChoice.nextLine();
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

    public void outputNumberBanknotesDM(int amount20, int amount50, int amount100) {
        System.out.println("In ATM there are:\n" +
                "\n\t\tbanknotes 20, quantity: " + amount20 +
                "\n\t\tbanknotes 50, quantity: " + amount50 +
                "\n\t\tbanknotes 100, quantity: " + amount100);

    }

    public void fullSumInATM(long sumOfMoneyInCashMachine) {
        System.out.println("In ATM there are " + sumOfMoneyInCashMachine + " money");
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void inputSum(int inputSum) {
        System.out.println("ATM can't approve this sum of money: " + inputSum + ". Cause of in ATM" +
                "\nthere are banknotes denomination 20, 50, 100.");
        System.out.println("\nATM can approve this sum of money: " + (inputSum + 10) + ". Continue?\n");
    }

    public void messageForSumDivisibleBy100(int i, int inputSumMoney, int valueFifty, int valueHundred) {
        switch (i) {
            case 1:
                System.out.println("Please, take 1 banknote with denomination 100");
                break;
            case 2:
                System.out.println("Please, take " + inputSumMoney / 100 + " banknote with denomination 100");
                break;
            case 3:
                System.out.println("Please, take " + valueHundred + " banknote with denomination 100," +
                        "\n" + (inputSumMoney - valueHundred * 100) / 50 + " banknote with denomination 50");
                break;
            case 4:
                System.out.println("Please, take " + valueHundred + " banknote with denomination 100," +
                        "\n" + valueFifty + " banknote with denomination 50," +
                        "\n" + (inputSumMoney - valueHundred * 100 - valueFifty * 50) / 20 + " banknote with denomination 20");
                break;
            case 5:
                System.out.println("Please, take " + valueHundred + " banknote with denomination 100," +
                        "\n" + (valueFifty - 1) + " banknote with denomination 50," +
                        "\n" + (inputSumMoney - valueHundred * 100 - (valueFifty - 1) * 50) / 20 + " banknote with denomination 20");
                break;
        }
        successfulOperation();
    }

    public void messageForSumDivisibleBy50(int i, int valueFifty, int valueHundred, int inputSumMoney) {
        switch (i) {
            case 1:
                System.out.println("Please, take 1 banknote with denomination 50");
                break;
            case 2:
                System.out.println("Please, take " + (inputSumMoney - 50) / 100 + " banknote with denomination 100," +
                        "\n1 banknote with denomination 50");
                break;
            case 3:
                System.out.println("Please, take " + valueHundred + " banknote with denomination 100," +
                        "\n" + (inputSumMoney - valueHundred * 100) / 50 + " banknote with denomination 50");
                break;
            case 4:
                System.out.println("Please, take " + valueHundred + " banknote with denomination 100," +
                        "\n" + (valueFifty - 1) + " banknote with denomination 50," +
                        "\n" + (inputSumMoney - valueHundred * 100 - (valueFifty - 1) * 50) / 20 + " banknote with denomination 20");
                break;
            case 5:
                System.out.println("Please, take " + valueHundred + " banknote with denomination 100," +
                        "\n" + valueFifty + " banknote with denomination 50," +
                        "\n" + (inputSumMoney - valueHundred * 100 - valueFifty * 50) / 20 + " banknote with denomination 20");
                break;
        }
        successfulOperation();
    }

    public void messageForSumDivisibleBy20(int i, int inputSumMoney, int valueHundred, int valueFifty, int count) {
        switch (i) {
            case 1:
                System.out.println("Take " + count + " banknote with denomination 20");
                break;
            case 2:
                System.out.println("Take " + count + " banknotes whit denomination 20," +
                        "\n" + (inputSumMoney - count * 20) / 100 + " whit denomination 100");
                break;
            case 3:
                System.out.println("Take " + count + " banknotes whit denomination 20," +
                        "\n" + valueHundred + " whit denomination 100," +
                        "\n" + (inputSumMoney - valueHundred * 100 - count * 20) / 50 + " whit denomination 50");
                break;
            case 4:
                System.out.println("Take " + valueHundred + " banknotes with denomination 100," +
                        "\n" + valueFifty + " banknotes with denomination 50," +
                        "\n" + (inputSumMoney - valueHundred*100 - valueFifty*50) / 20 + " banknotes with denomination 20");
                break;
            case 5:
                System.out.println("Take " + valueHundred + " banknotes with denomination 100," +
                        "\n" + (valueFifty - 1) + " banknotes with denomination 50," +
                        "\n" + (inputSumMoney - valueHundred * 100 - (valueFifty - 1)*50) / 20 + " banknotes with denomination 20");
                break;
        }
        successfulOperation();
    }

    public void messageForSumEndedBy70(int i, int inputSumMoney, int valueHundred, int valueFifty) {
        switch (i) {
            case 1:
                System.out.println("Take 1 banknote with denomination 20," +
                        "1  banknote with denomination 50");
                break;
            case 2:
                System.out.println("Take 1 banknote with denomination 20, " +
                        "\n1  banknote with denomination 50," +
                        "\n" + (inputSumMoney - 70)/100 + " banknote with denomination 100");
                break;
            case 3:
                System.out.println("Take " + valueHundred + " banknote with denomination 100," +
                        "\n" + (inputSumMoney - valueHundred*100 - 20)/50 + " banknote with denomination 50," +
                        "\n1 banknote with denomination 20");
                break;
            case 4:
                System.out.println("Take " + valueHundred + " banknote with denomination 100," +
                        "\n" + (valueFifty-1) + " banknote with denomination 50," +
                        "\n"+ (inputSumMoney - valueHundred*100 - (valueFifty-1)*50)/20 + " banknote with denomination 20");
                break;
            case 5:
                System.out.println("Take " + valueHundred + " banknote with denomination 100," +
                        "\n" + valueFifty + " banknote with denomination 50," +
                        "\n"+ (inputSumMoney - valueHundred*100 - valueFifty*50)/20 + " banknote with denomination 20");
                break;
        }
        successfulOperation();
    }

    public void messageForSumEndedBy90(int i, int inputSumMoney, int valueHundred, int valueFifty) {
        switch (i) {
            case 1:
                System.out.println("Take 2 banknote with denomination 20," +
                        "1  banknote with denomination 50");
                break;
            case 2:
                System.out.println("Take 2 banknote with denomination 20, " +
                        "\n1  banknote with denomination 50," +
                        "\n" + (inputSumMoney - 90)/100 + " banknote with denomination 100");
                break;
            case 3:
                System.out.println("Take " + valueHundred + " banknote with denomination 100," +
                        "\n" + (inputSumMoney - valueHundred*100 - 40)/50 + "banknote with denomination 50," +
                        "\n1 banknote with denomination 20");
                break;
            case 4:
                System.out.println("Take " + valueHundred + " banknote with denomination 100," +
                        "\n" + (valueFifty-1) + " banknote with denomination 50," +
                        "\n"+ (inputSumMoney - valueHundred*100 - (valueFifty-1)*50)/20 + " banknote with denomination 20");
                break;
            case 5:
                System.out.println("Take " + valueHundred + " banknote with denomination 100," +
                        "\n" + valueFifty + " banknote with denomination 50," +
                        "\n"+ (inputSumMoney - valueHundred*100 - valueFifty*50)/20 + " banknote with denomination 20");
                break;
        }
        successfulOperation();
    }

    public void incorrectInput() {
        System.out.println("Incorrect input.");
    }

    public void successfulOperation() {
        System.out.println("\nOperation was successful");
    }

    public void notHaveEnoughMoney() {
        System.out.println("The ATM doesn't have enough money. Thank you for using our ATM. Have a nice day." +
                " Goodbye. ");
    }
}
