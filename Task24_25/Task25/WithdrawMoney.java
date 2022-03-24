package Task24_25.Task25;

import java.util.Scanner;

public class WithdrawMoney {

    Scanner scanner = new Scanner(System.in);

    private String sum;
    int someMoney;
    int inputSum;

    FinishOperation fo;

    public WithdrawMoney() {
        this.fo = new FinishOperation();
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
        if(inputSum >= 0){
            if(inputSum / 100 == 30 || inputSum / 100 == 90 || inputSum / 100 == 10){

                System.out.println("ATM can't approve this sum of money: " + inputSum + ". Cause of in ATM" +
                        "\n there are banknotes denomination 20, 50, 100.");
                System.out.println("ATM can approve this sum of money: " + (inputSum + 10) + ". Continue?");

                fo.IsOperationFinished();
                if(fo.getFinishOperation()) someMoney = inputSum + 10;

            } else someMoney = inputSum;
        } else someMoney = -1;
    }

    public int getInputSum() {
        return someMoney;
    }
}
