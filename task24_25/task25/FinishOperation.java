package task24_25.task25;

import java.util.Scanner;

public class FinishOperation {

    Scanner scanner = new Scanner(System.in);
    private boolean finishOperation = true;

    public void IsOperationFinished(){

        System.out.println("Would you like continue? " +
                "Enter \"Y\" for continue, \"N\" for exit");
        String exit = scanner.nextLine();

        if(exit.equalsIgnoreCase("N"))
            finishOperation = false;
        else if(exit.equalsIgnoreCase("Y"))
            finishOperation = true;
        else {
            System.out.println("Incorrect input");
            finishOperation = false;
        }
    }

    public boolean getFinishOperation(){
        return finishOperation;
    }
}
