package Task24_25.Task25;

import java.util.Scanner;

public class CashMachineDepositMoney {

    Scanner scanner = new Scanner(System.in);
    FinishOperation fo = new FinishOperation();

    private int countTwenty;
    private int countFifty;
    private int countHundred;

    public void choice(){
        String choice;

        while (fo.getFinishOperation()) {
            System.out.println("This ATM takes banknotes with denominations: 20, 50, 100." +
                    "\nWould you like to add banknotes with denominations:" +
                    "\n\t1. 20;" +
                    "\n\t2. 50;" +
                    "\n\t3. 100. " +
                    "\n\nIf you want to add banknotes with denominations 20 enter 1," +
                    "50 enter 2, 100 enter 3");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    new CashMachineDepositMoney().banknote20();
                    break;
                case "2":
                    new CashMachineDepositMoney().banknote50();
                    break;
                case "3":
                    new CashMachineDepositMoney().banknote100();
                    break;
                default:
                    System.out.println("Incorrect input.");
                    break;
            }
            fo.IsOperationFinished();
        }
    }

    public int banknote20() {
        System.out.println("Input number of banknotes with denominations 20: ");
        String banknote = scanner.nextLine();
        if (banknote.matches("\\d+")){
            countTwenty = Integer.parseInt(banknote);
            System.out.println("Operation was successful");
        }
        else{
            System.out.println("Incorrect input");
            countTwenty = 0;
        }
        return countTwenty;
    }

    public int banknote50() {
        System.out.println("Input number of banknotes with denominations 50: ");
        String banknote = scanner.nextLine();
        if (banknote.matches("\\d+")){
            countFifty = Integer.parseInt(banknote);
            System.out.println("Operation was successful");
        }
        else{
            System.out.println("Incorrect input");
            countFifty = 0;
        }
        return countFifty;
    }

    public int banknote100() {
        System.out.println("Input number of banknotes with denominations 100: ");
        String banknote = scanner.nextLine();
        if (banknote.matches("\\d+")){
            countHundred = Integer.parseInt(banknote);
            System.out.println("Operation was successful");
        }
        else{
            System.out.println("Incorrect input");
            countHundred = 0;
        }
        return countHundred;
    }

    public int getBanknote20(){
        return countTwenty;
    }

    public int getBanknote50(){
        return countFifty;
    }

    public int getBanknote100(){
        return countHundred;
    }
}
