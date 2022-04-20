package task.FileHelp;

import java.io.*;

public class Help {

    String helpFile;

    public Help(String name) {
        helpFile = name;
    }


    public boolean helpOn(String what) {

        int ch;
        String topic, info;

        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpFile))) {
            do{
                ch = helpRdr.read();

                if(ch == '#'){
                    topic = helpRdr.readLine();
                    if(what.compareTo(topic) == 0){
                        do{
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }


    public String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return topic;
    }
}
