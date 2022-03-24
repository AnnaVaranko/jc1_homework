package Task24_25.Task25;

import java.util.Scanner;

public class UserDisplay {
    FinishOperation fo;

    private int userChoice;
    private String yourFirstChoice;
    private int caseOfDivision;

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

    public void outputNumberBanknotesDepositMoney(int twenty, int fifty, int hundred,
                                                  int countTwenty, int countFifty, int countHundred) {
        int amount20 = twenty + countTwenty;
        int amount50 = fifty + countFifty;
        int amount100 = hundred + countHundred;
        System.out.println("In ATM there are:\n" +
                "\n\t\tbanknotes 20, quantity: " + amount20 +
                "\n\t\tbanknotes 50, quantity: " + amount50 +
                "\n\t\tbanknotes 100, quantity: " + amount100);

    }

    public void outputNumberBanknotesWithdrawMoney(int valueTwenty, int valueFifty,
                                                   int valueHundred, int inputSum) {
        if(inputSum <= 0) System.out.println("Incorrect input");

        int sumOnHundred = (valueTwenty * 100 / 5) + (valueFifty * 100 / 2) + (valueHundred * 100);

        if(sumOnHundred  > inputSum & inputSum > 0){
            System.out.println("ATM prepares sum of money...");
            byWhatDivisibleNumber(inputSum);
            whichMoneyGive(valueTwenty, valueFifty, valueHundred, inputSum);
        } else if (sumOnHundred < inputSum & inputSum > 0)
            System.out.println("The ATM doesn't have enough money. Thank you for using our ATM. Have a nice day." +
                " Goodbye. ");

    }

    private void byWhatDivisibleNumber(int sum) {
        if(sum % 100 == 0) caseOfDivision = 1;
        else if(sum % 50 == 0) caseOfDivision = 2;
        else if (sum % 20 == 0) caseOfDivision = 3;
        else if (sum / 100 == 70) caseOfDivision = 4;
    }

    private void whichMoneyGive(int twenty, int fifty, int hundred, int sum) {
//        int countTwenty;
//        int countFifty;
//        int countHundred;

         if(caseOfDivision == 1){
             if(hundred >= (sum / 100)) {
                 System.out.println("Take " + (sum / 100) + " banknotes with denomination 100.");
             } else if(hundred + (fifty / 2) >= (sum / 100)){
                 System.out.println("Take " + hundred + " banknotes with denomination 100," +
                         "\n" + ((sum / 100 - hundred) * 2) + " banknotes with denomination 50.");
             } else {
                 System.out.println("Take " + hundred + " banknotes with denomination 100," +
                         "\n" + fifty + " banknotes with denomination 50," +
                         "\n" + ((sum / 100 - hundred - (fifty / 2) ) * 5) + " banknotes with denomination 50.");
             }
         }

    }
}
