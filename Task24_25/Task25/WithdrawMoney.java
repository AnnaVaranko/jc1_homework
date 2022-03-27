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
        if(inputSumMoney == 100) System.out.println("Please, take 1 banknote with denomination 100");

        if(inputSumMoney <= valueHundred * 100){
            System.out.println("Please, take" + inputSumMoney/100 + "banknote with denomination 100");
        } else if(inputSumMoney <= (valueHundred * 100 + valueFifty * 50)){
            System.out.println("Please, take" + valueHundred + "banknote with denomination 100," +
                    "\n" + (inputSumMoney - valueHundred*100)/50 + "banknote with denomination 50");
        } else if (inputSumMoney <= (valueHundred * 100 + valueFifty * 50 + valueTwenty * 20)){
            System.out.println("Please, take" + valueHundred + "banknote with denomination 100," +
                    "\n" + (inputSumMoney - valueHundred*100)/50 + "banknote with denomination 50," +
                    "\n" + (inputSumMoney - valueHundred*100 - valueFifty*50)/20 + "banknote with denomination 20");
        }

    }

    private void inputSumDivisibleBy50() {

    }

    private void inputSumDivisibleBy20() {
    }


    private void inputSumEndedOf70() {
    }

}
