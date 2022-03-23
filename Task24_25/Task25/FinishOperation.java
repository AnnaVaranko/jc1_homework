package Task24_25.Task25;

import java.util.Scanner;

public class FinishOperation {

    Scanner scanner = new Scanner(System.in);
    private boolean finishOperation = true;

    public void IsOperationFinished(){

        System.out.println("Would you like continue? " +
                "Enter \"Y\" for continue, \"N\" for exit");
        String exit = scanner.nextLine();

        if(exit.toUpperCase().equals("N"))
            finishOperation = false;
        else if(exit.toUpperCase().equals("Y"))
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
