package task46_54.task46;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task46 {
    public  String getFile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to file or directory");
        return scanner.nextLine();
    }

    public static void main(String[] args)  {

        try {
            PathToFile pathToFile = new PathToFile(new Task46().getFile());
            pathToFile.getFileName();

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found exception.");

        } catch (IOException e){
            System.out.println("ERROR: input/output exception.");
        }
    }
}
