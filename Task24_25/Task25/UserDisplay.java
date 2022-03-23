package Task24_25.Task25;

import java.util.Scanner;

public class UserDisplay {

    private int userChoice;
    private String yourFirstChoice;

    public void numberOfBanknotes(int twenty, int fifty, int hundred) {
        System.out.println("In ATM there are:\n" +
                "\t\tbanknotes 20, quantity: " + twenty +
                "\t\tbanknotes 50, quantity: " + fifty +
                "\t\tbanknotes 100, quantity: " + hundred);
    }

    private void choiceOfOperation(){
        Scanner firstChoice = new Scanner(System.in);

        System.out.println("Would you like: " +
                "\n\t1.Deposit money into account;" +
                "\n\t2.Withdraw money from account." +
                "\n\nIf you want deposit money into account enter number 1," +
                "withdraw money from account enter number 2.");
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

}
