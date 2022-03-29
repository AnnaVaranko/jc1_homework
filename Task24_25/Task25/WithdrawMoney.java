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
            if(inputSum % 100 == 30 || inputSum % 100 == 10){

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
            System.out.println("ATM prepares sum of money...\n");
            byWhatDivisibleInputSum();
            whichMoneyGive();
        } else if (sumMoneyInCashMachine < inputSumMoney)
            userDisplay.notHaveEnoughMoney();
    }

    private void byWhatDivisibleInputSum() {
        if(inputSumMoney % 100 == 0) caseOfDivision = 1;
        else if(inputSumMoney % 50 == 0) caseOfDivision = 2;
        else if (inputSumMoney % 20 == 0) caseOfDivision = 3;
        else if (inputSumMoney % 100 == 70) caseOfDivision = 4;
        else if (inputSumMoney % 100 == 90) caseOfDivision = 5;
    }

    private void whichMoneyGive() {
        switch (caseOfDivision){
            case 1: inputSumDivisibleBy100();
            break;
            case 2: inputSumDivisibleBy50();
            break;
            case 3: inputSumDivisibleBy20();
            break;
            case 4: inputSumEndedBy70();
            break;
            case 5: inputSumEndedBy90();
            break;
            default: userDisplay.incorrectInput();
        }
    }

    private void inputSumDivisibleBy100() {

        if(inputSumMoney == 100){
            userDisplay.messageForSumDivisibleBy100(1, inputSumMoney, valueFifty,valueHundred);
            return;
        }

        if(inputSumMoney <= valueHundred * 100){
            userDisplay.messageForSumDivisibleBy100(2, inputSumMoney, valueFifty, valueHundred);

        } else if(inputSumMoney <= (valueHundred * 100 + valueFifty * 50)){
            userDisplay.messageForSumDivisibleBy100(3, inputSumMoney, valueFifty, valueHundred);

        } else if (inputSumMoney <= (valueHundred * 100 + valueFifty * 50 + valueTwenty * 20)){

            if(valueFifty % 2 == 0){
                userDisplay.messageForSumDivisibleBy100(4, inputSumMoney, valueFifty, valueHundred);
            }
            else{
                userDisplay.messageForSumDivisibleBy100(5, inputSumMoney, valueFifty, valueHundred);
            }
            
        }

    }

    private void inputSumDivisibleBy50() {

        if(inputSumMoney == 50){
            userDisplay.messageForSumDivisibleBy50(1, valueFifty, valueHundred, inputSumMoney);
            return;
        }

        if(inputSumMoney <= valueHundred * 100){
            userDisplay.messageForSumDivisibleBy50(2, valueFifty, valueHundred, inputSumMoney);

        } else if(inputSumMoney <= (valueHundred * 100 + valueFifty * 50)){
            userDisplay.messageForSumDivisibleBy50(3, valueFifty, valueHundred, inputSumMoney);

        }else if (inputSumMoney <= (valueHundred * 100 + valueFifty * 50 + valueTwenty * 20)) {

            if(valueFifty % 2 == 0){
                userDisplay.messageForSumDivisibleBy50(4, valueFifty, valueHundred, inputSumMoney);
            } else{
                userDisplay.messageForSumDivisibleBy50(5, valueFifty, valueHundred, inputSumMoney);
            }
        }
    }

    private void inputSumDivisibleBy20() {
        int count;

        if (inputSumMoney % 100 == 20) {
            count = 1;
            if (inputSumMoney == 20) {
                userDisplay.messageForSumDivisibleBy20(1, inputSumMoney, valueHundred,valueFifty, count);

            } else {
                if(inputSumMoney < valueHundred*100 + 20){
                    userDisplay.messageForSumDivisibleBy20(2, inputSumMoney, valueHundred,valueFifty, count );

                } else if (inputSumMoney < valueHundred*100 + 20 + valueFifty * 50){
                    userDisplay.messageForSumDivisibleBy20(3, inputSumMoney, valueHundred,valueFifty, count);
                }
                else {
                    if(valueFifty % 2 == 0){
                        userDisplay.messageForSumDivisibleBy20(4, inputSumMoney, valueHundred,valueFifty, count);
                    } else {
                        userDisplay.messageForSumDivisibleBy20(5, inputSumMoney, valueHundred,valueFifty, count);
                    }
                }

            }

        } else if (inputSumMoney % 100 == 40) {
            count = 2;
            if (inputSumMoney == 40) {
                userDisplay.messageForSumDivisibleBy20(1, inputSumMoney, valueHundred,valueFifty, count );

            } else {

                if(inputSumMoney < valueHundred*100 + 2 * 20){
                    userDisplay.messageForSumDivisibleBy20(2, inputSumMoney, valueHundred,valueFifty, count );

                } else if (inputSumMoney < valueHundred*100 + 2*20 + valueFifty * 50){
                    userDisplay.messageForSumDivisibleBy20(3, inputSumMoney, valueHundred,valueFifty, count );
                }
                else {

                    if(valueFifty % 2 == 0){
                        userDisplay.messageForSumDivisibleBy20(4, inputSumMoney, valueHundred,valueFifty, count );

                    } else {
                        userDisplay.messageForSumDivisibleBy20(5, inputSumMoney, valueHundred,valueFifty, count );
                    }
                }
            }

        } else if (inputSumMoney % 100 == 60) {
            count = 3;
            if (inputSumMoney == 60) {
                userDisplay.messageForSumDivisibleBy20(1, inputSumMoney, valueHundred,valueFifty, count );

            } else {
                if(inputSumMoney < valueHundred*100 + 3 * 20){
                    userDisplay.messageForSumDivisibleBy20(2, inputSumMoney, valueHundred,valueFifty, count );

                } else if (inputSumMoney < valueHundred*100 + 3*20 + valueFifty * 50){
                    userDisplay.messageForSumDivisibleBy20(3, inputSumMoney, valueHundred,valueFifty, count);
                }
                else {
                    if(valueFifty % 2 == 0){
                        userDisplay.messageForSumDivisibleBy20(4, inputSumMoney, valueHundred,valueFifty, count);
                    } else {
                        userDisplay.messageForSumDivisibleBy20(5, inputSumMoney, valueHundred,valueFifty, count);
                    }
                }
            }
        } else if (inputSumMoney % 100 == 80) {
            count = 4;
            if (inputSumMoney == 80) {
                userDisplay.messageForSumDivisibleBy20(1, inputSumMoney, valueHundred,valueFifty, count);

            } else {
                if(inputSumMoney < valueHundred*100 + 4 * 20){
                    userDisplay.messageForSumDivisibleBy20(2, inputSumMoney, valueHundred,valueFifty, count);
                    
                } else if (inputSumMoney < valueHundred*100 + 4*20 + valueFifty * 50){
                    userDisplay.messageForSumDivisibleBy20(3, inputSumMoney, valueHundred,valueFifty, count);
                }
                else {
                    if(valueFifty % 2 == 0){
                        userDisplay.messageForSumDivisibleBy20(4, inputSumMoney, valueHundred,valueFifty, count);
                    } else {
                        userDisplay.messageForSumDivisibleBy20(5, inputSumMoney, valueHundred,valueFifty, count);
                    }
                }
            }
        }
    }


    private void inputSumEndedBy70() {
        if (inputSumMoney == 70) {
            userDisplay.messageForSumEndedBy70(1, inputSumMoney, valueHundred, valueFifty);
        }

        if(inputSumMoney < valueHundred*100 + 70){
            userDisplay.messageForSumEndedBy70(2, inputSumMoney, valueHundred, valueFifty);

        } else if (inputSumMoney < valueHundred * 100 + (valueFifty - 1) * 50 + 70) {
            userDisplay.messageForSumEndedBy70(3, inputSumMoney, valueHundred, valueFifty);

        } else{
            if(valueFifty % 2 == 0){
                userDisplay.messageForSumEndedBy70(4, inputSumMoney, valueHundred, valueFifty);

            } else{
                userDisplay.messageForSumEndedBy70(5, inputSumMoney, valueHundred, valueFifty);
            }
        }

    }

    private void inputSumEndedBy90() {
        if (inputSumMoney == 90) {
            userDisplay.messageForSumEndedBy90(1, inputSumMoney, valueHundred, valueFifty);
        }

        if(inputSumMoney < valueHundred*100 + 90){
            userDisplay.messageForSumEndedBy90(2, inputSumMoney, valueHundred, valueFifty);

        } else if (inputSumMoney < valueHundred * 100 + (valueFifty - 1) * 50 + 90) {
            userDisplay.messageForSumEndedBy90(3, inputSumMoney, valueHundred, valueFifty);

        } else{
            if(valueFifty % 2 == 0){
                userDisplay.messageForSumEndedBy90(4, inputSumMoney, valueHundred, valueFifty);

            } else{
                userDisplay.messageForSumEndedBy90(5, inputSumMoney, valueHundred, valueFifty);
            }
        }
    }

}
