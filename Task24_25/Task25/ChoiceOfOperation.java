package Task24_25.Task25;

import java.util.Scanner;

public class ChoiceOfOperation {
    CashMachineDepositMoney m = new CashMachineDepositMoney();
    FinishOperation fo = new FinishOperation();

    public void getChoiceOfOperation(){
        while (fo.getFinishOperation()) {
            Scanner firstChoice = new Scanner(System.in);
            System.out.println("Would you like: " +
                    "\n\t1.Deposit money into account;" +
                    "\n\t2.Withdraw money from account." +
                    "\n\nIf you want deposit money into account enter number 1," +
                    "withdraw money from account enter number 2.");
            String yourFirstChoice = firstChoice.nextLine();

            if (yourFirstChoice.equals("1")) {
                m.choice();
            }
            else if (yourFirstChoice.equals("2")) {

            } else {
                System.out.println("Incorrect input");

            }
            System.out.println("Would you like: " +
                    "\n\t1.Deposit money into account;" +
                    "\n\t2.Withdraw money from account." +
                    "\n\nIf you want deposit money into account enter number 1," +
                    "withdraw money from account enter number 2.");
            fo.IsOperationFinished();
        }
    }
}
