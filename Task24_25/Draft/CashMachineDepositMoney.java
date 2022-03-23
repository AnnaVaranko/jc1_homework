package Task24_25.Draft;

import Task24_25.Task25.FinishOperation;

import java.util.Scanner;

public class CashMachineDepositMoney {

    Scanner scanner = new Scanner(System.in);
    FinishOperation fo = new FinishOperation();

    private int countTwenty = 0;
    private int countFifty = 0;
    private int countHundred = 0;

    public void choice(CashMachineDepositMoney m){

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
                    m.banknote20();
                    break;
                case "2":
                    m.banknote50();
                    break;
                case "3":
                    m.banknote100();
                    break;
                default:
                    System.out.println("Incorrect input.");
                    break;
            }

            fo.IsOperationFinished();
        }
    }

    public int banknote20() {
        int banknote20;

        System.out.println("Input number of banknotes with denominations 20: ");
        String banknote = scanner.nextLine();

        if (banknote.matches("\\d+")){
            countTwenty = countTwenty + Integer.parseInt(banknote);
            System.out.println("Operation was successful");
        }
        else{
            System.out.println("Incorrect input");
            countTwenty = 0;
        }

        return countTwenty;
    }


    public void banknote50() {

        System.out.println("Input number of banknotes with denominations 50: ");
        String banknote = scanner.nextLine();

        if (banknote.matches("\\d+")){
            countFifty = countFifty + Integer.parseInt(banknote);
            System.out.println("Operation was successful");
        }
        else{
            System.out.println("Incorrect input");
            countFifty = 0;
        }
    }

    public void banknote100() {

        System.out.println("Input number of banknotes with denominations 100: ");
        String banknote = scanner.nextLine();

        if (banknote.matches("\\d+")){
            countHundred = countHundred + Integer.parseInt(banknote);
            System.out.println("Operation was successful");
        }
        else{
            System.out.println("Incorrect input");
            countHundred = 0;
        }
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

    public void check(){
        System.out.println("CountTwenty in class CashMachineDepositMoney" + countTwenty);
        System.out.println("CountFifty in class CashMachineDepositMoney" + countFifty);
        System.out.println("CountHundred in class CashMachineDepositMoney" + countHundred);
    }
}
