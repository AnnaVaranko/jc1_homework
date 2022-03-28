package Task24_25.Task25;

import java.util.Scanner;

public class WithdrawMoney {

    Scanner scanner = new Scanner(System.in);

    private String sum;
    private int inputSum;
    private int inputSumMoney;
    int valueTwenty;
    int valueFifty;
    int valueHundred;

    private int caseOfDivision;

    FinishOperation fo;
    private final UserDisplay userDisplay;

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
                if(fo.getFinishOperation()) inputSumMoney = inputSum + 10;

            } else inputSumMoney = inputSum;

        } else inputSumMoney = -1;
    }

    public void toGiveMoney(int valueTwenty, int valueFifty, int valueHundred){
        outputNumberOfBanknotes(valueTwenty, valueFifty, valueHundred);
    }
    private void outputNumberOfBanknotes(int twenty, int fifty,int hundred) {
        this.valueTwenty = twenty;
        this.valueFifty = fifty;
        this.valueHundred = hundred;

        if(inputSumMoney <= 0){
            userDisplay.incorrectInput();
        }

        ifEnoughMoneyOnATM();
    }

    private void ifEnoughMoneyOnATM() {
        int sumMoneyInCashMachine = (valueTwenty * 20) + (valueFifty * 50) + (valueHundred * 100);

        if(sumMoneyInCashMachine >= inputSumMoney & inputSumMoney > 0){
            System.out.println("ATM prepares sum of money...");
            byWhatDivisibleInputSum();
            whichMoneyGive();
        } else if (sumMoneyInCashMachine < inputSumMoney)
            userDisplay.notHaveEnoughMoney();
    }

    private void byWhatDivisibleInputSum() {
        if(inputSumMoney % 100 == 0) caseOfDivision = 1;
        else if(inputSumMoney % 50 == 0) caseOfDivision = 2;
        else if (inputSumMoney % 20 == 0) caseOfDivision = 3;
        else if (inputSumMoney / 100 == 70) caseOfDivision = 4;
    }

    private void whichMoneyGive() {
        switch (caseOfDivision){
            case 1: inputSumDivisibleBy100();
            break;
            case 2: inputSumDivisibleBy50();
            break;
            case 3: inputSumDivisibleBy20();
            break;
            case 4: inputSumEndedOf70();
            default: userDisplay.incorrectInput();
        }
    }

    private void inputSumDivisibleBy100() {

        if(inputSumMoney == 100){
            userDisplay.messageForSumDivisibleBy100(1, inputSumMoney, valueFifty,valueHundred);
            userDisplay.successfulOperation();
            return;
        }

        if(inputSumMoney <= valueHundred * 100){
            userDisplay.messageForSumDivisibleBy100(2, inputSumMoney, valueFifty, valueHundred);
            userDisplay.successfulOperation();

        } else if(inputSumMoney <= (valueHundred * 100 + valueFifty * 50)){
            userDisplay.messageForSumDivisibleBy100(3, inputSumMoney, valueFifty, valueHundred);
            userDisplay.successfulOperation();

        } else if (inputSumMoney <= (valueHundred * 100 + valueFifty * 50 + valueTwenty * 20)){

            if(valueFifty % 2 == 0) userDisplay.messageForSumDivisibleBy100(4, inputSumMoney, valueFifty, valueHundred);
            else userDisplay.messageForSumDivisibleBy100(5, inputSumMoney, valueFifty, valueHundred);
            userDisplay.successfulOperation();
        }

    }

    private void inputSumDivisibleBy50() {

        int sumTemporary =0;

        if(inputSumMoney == 50){
            userDisplay.messageForSumDivisibleBy50(1,  valueHundred, inputSumMoney, sumTemporary);
            userDisplay.successfulOperation();
            return;
        }

        if(inputSumMoney <= valueHundred * 100){
            userDisplay.messageForSumDivisibleBy50(2, valueHundred, inputSumMoney, sumTemporary);
            userDisplay.successfulOperation();

        } else if(inputSumMoney <= (valueHundred * 100 + valueFifty * 50)){
            sumTemporary = inputSumMoney - valueHundred *100;
            userDisplay.messageForSumDivisibleBy50(3,  valueHundred, inputSumMoney, sumTemporary);
            userDisplay.successfulOperation();

        }else if (inputSumMoney <= (valueHundred * 100 + valueFifty * 50 + valueTwenty * 20)) {
            //TODO
            sumTemporary = inputSumMoney - 50 -valueHundred * 100;
            userDisplay.messageForSumDivisibleBy50(4, valueHundred, inputSumMoney, sumTemporary);
            userDisplay.successfulOperation();
        }
    }

    private void inputSumDivisibleBy20() {

        if (inputSumMoney % 100 == 20) {
            if (inputSumMoney == 20) {
                System.out.println("Take 1 banknote with denomination 20");
                userDisplay.successfulOperation();
            } else {

            }

        } else if (inputSumMoney % 100 == 40) {
            if (inputSumMoney == 40) {
                System.out.println("Take 2 banknote with denomination 20");
                userDisplay.successfulOperation();
            } else {
            }

        } else if (inputSumMoney % 100 == 60) {
            if (inputSumMoney == 60) {
                System.out.println("Take 3 banknote with denomination 20");
                userDisplay.successfulOperation();
            } else {

            }
        } else if (inputSumMoney % 100 == 80) {
            if (inputSumMoney == 80) {
                System.out.println("Take 4 banknote with denomination 20");
                userDisplay.successfulOperation();
            } else {

            }
        }
    }


    private void inputSumEndedOf70() {
        if (inputSumMoney == 70) {
            System.out.println("Take 1 banknote with denomination 50," +
                    "1  banknote with denomination 70");
            userDisplay.successfulOperation();
        }

    }
}
