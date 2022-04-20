package task46_54.task46;

import java.io.File;
import java.io.IOException;

public class PathToFile {

    File path;
    String myFile = "";
    String myDirectory = "";

    PathToFile(String filesName){
        path = new File(filesName);
        System.out.println(filesName);
    }

    public void getFileName() throws IOException, NullPointerException {
        System.out.println(path.getName());
        if(path.exists()){
            System.out.println("Absolute path: " + path.getCanonicalPath());

            if(path.isDirectory()){
                String[] file = path.list();
                for (int i = 0; i < file.length; i++){
                    path = new File((file[0]));
                    if(path.isDirectory()){
                        myDirectory = path.getName() + " ";
                    } else myFile = path.getName() + " ";
                }
            }

            printNameOfFileAndDirectory();
        } else System.out.println("File not found.");
    }

    private void printNameOfFileAndDirectory(){
        if(!myFile.equals("")) {
            System.out.println("File: " + myFile);
        } else System.out.println("There is not file");

        if(!myDirectory.equals("")) {
            System.out.println("Directory: " + myDirectory);
        } else System.out.println("There is not directory");
    }
}
