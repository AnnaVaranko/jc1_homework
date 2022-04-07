package task24_25.Draft;

import task24_25.task25.FinishOperation;
import task24_25.task25.NumberBanknotes;

import java.util.Scanner;

public class CashMachineWithdrawMoney {
    public void withdrawMoney(NumberBanknotes nb, FinishOperation fo){

        int sumInATM;
        Scanner scanner = new Scanner(System.in);

        while (fo.getFinishOperation()){

            sumInATM = nb.getValueTwenty() + nb.getValueFifty() + nb.getValueHundred();
            System.out.println("В этом банкомате есть сумма: " + sumInATM + ".");

            System.out.println("Введите сумму кратную 20 или 50 и не больше суммы в банкомате:");

            String sum = scanner.nextLine();
            if(sum.matches("\\d+")){
                int sumMoney = Integer.parseInt(sum);
                //if()
            }
        }
    }
}
