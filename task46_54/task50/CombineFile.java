package task46_54.task50;

import java.io.*;

public class CombineFile {


    public void work() {
        writeFiveFiles();
        readAndWriteFile();
        createFileDirectory();
    }

    private void writeFiveFiles() {
        try {
            DataOutputStream dataOut;
            int count = 0;
            int number;

            for(int i = 1; i <= 5; i ++) {
                dataOut = new DataOutputStream(new BufferedOutputStream
                        (new FileOutputStream("step1/step2/step3/file" + i)));
                while (count < 10){
                    number = (int) (Math.random() * 10000 + 1);
                    dataOut.writeInt(number);
                    System.out.print(number + " ");
                    count++;
                }
                dataOut.close();
                count = 0;
                System.out.println();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void readAndWriteFile() {
        try (DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream
                (new FileOutputStream("step1/step2/step3/allFile")))
        ){
            DataInputStream dataIn;

            for(int i = 1; i <= 5; i ++) {
                dataIn = new DataInputStream(new BufferedInputStream
                        (new FileInputStream("step1/step2/step3/file" + i)));
                for(int j = 0; j < 10; j ++) {
                    int num = dataIn.readInt();
                    dataOut.writeInt(num);
                }
                dataIn.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createFileDirectory() {
        try (FileWriter fw = new FileWriter("step1/step2/step3/directory")
        ) {
            File file = new File("step1/step2/step3");

            String[] files = file.list();

            for (String f: files){
                fw.write(f + " ");
            }

        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
