package Task24_25.Task25;

import java.util.Scanner;

public class WithdrawMoney {

    Scanner scanner = new Scanner(System.in);

    private String sum;
    private int sumMoney;
    private int inputSum;
    int valueTwenty;
    int valueFifty;
    int valueHundred;

    private int caseOfDivision;

    FinishOperation fo;
    private UserDisplay userDisplay;

    public WithdrawMoney() {
        this.fo = new FinishOperation();
        this.userDisplay = new UserDisplay();
    }

    public void withdrawMoney() {
            enterSum();
            checkEnterSum();
    }

    private void enterSum() {
        System.out.println("Enter sum divisible by ten: ");
        sum = scanner.nextLine();
    }

    private void checkEnterSum(){
        if(sum.matches("\\d{0,8}[0]")){
            inputSum = Integer.parseInt(sum);
            checkSum();
        } else {
            inputSum = -1;
        }
    }

    private void checkSum() {
        if(inputSum > 0){
            if(inputSum % 100 == 30 || inputSum % 100 == 90 || inputSum % 100 == 10){
                userDisplay.inputSum(inputSum);

                fo.IsOperationFinished();
                if(fo.getFinishOperation()) sumMoney = inputSum + 10;

            } else sumMoney = inputSum;
        } else sumMoney = -1;
    }

//    public int getInputSum() {
//        return someMoney;
//    }

    public void outputNumberBanknotesWithdrawMoney(int valueTwenty, int valueFifty, int valueHundred) {
        this.valueTwenty = valueTwenty;
        this.valueFifty = valueFifty;
        this.valueHundred = valueHundred;

        if(sumMoney <= 0){
            userDisplay.incorrectInput();
        }

        int sumOnHundred = (valueTwenty * 100 / 5) + (valueFifty * 100 / 2) + (valueHundred * 100);

        if(sumOnHundred > sumMoney & sumMoney > 0){
            System.out.println("ATM prepares sum of money...");
            byWhatDivisibleNumber(sumMoney);
            whichMoneyGive(valueTwenty, valueFifty, valueHundred, sumMoney);
        } else if (sumOnHundred < sumMoney)
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

        System.out.println("private void whichMoneyGive");
    }
}
