package task46_54.task47;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadAndUseFile {

    String name;
    StringBuilder filesContent;

    ReadAndUseFile(String filesName){
        name = filesName;
        filesContent = new StringBuilder();
    }

    protected void readMyFile() {
        try (
                FileReader fileReader = new FileReader(name);
                BufferedReader br = new BufferedReader(fileReader);
        ) {
            readFile(br);
            calculateNumberOfPunctuationMarks();
            calculateNumberOfWords();
        } catch (NullPointerException e){
            System.out.println("null pointer exception");
        } catch (IOException e) {
            System.out.println("Input/output exception");
        }
    }

    public void readFile(BufferedReader br) throws IOException {
        String str = "";
        do{
            str = br.readLine();
            if(str != null)
                filesContent.append(str);
        }while (str != null);
        System.out.println(filesContent);
    }

    private void calculateNumberOfPunctuationMarks() throws IOException {
        int counter = 0;
        int count = 0;
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile("[.,?!:;-]");
        matcher = pattern.matcher(filesContent);
        while (matcher.find()) counter++;

        pattern = Pattern.compile("[.]{3}");
        matcher = pattern.matcher(filesContent);
        while (matcher.find())
                count++;

        if(count == 0)
        System.out.println("Number of punctuation marks in this file is " + counter);
        else{
            counter = counter - (count * 2);
            System.out.println("Number of punctuation marks in this file is " + counter);
        }
    }

    private void calculateNumberOfWords() {
        char symbol;
        int count = 0;

        String str = String.valueOf(filesContent);
        String str2 = str.replaceAll(" +", " ");
        String str3 = str2.stripLeading();
        str = str3 + " ";
//        System.out.println("Line without extra space: " + str3);

        if(!str.equals(" ")) {
            for (int i = 0; i < str.length(); i++) {
                symbol = str.charAt(i);
                if (symbol == ' ') {
                    count++;
                }
            }
            System.out.println("Number of word in the text: " + count);
        } else System.out.println("In the text there isn't word.");
    }
}
