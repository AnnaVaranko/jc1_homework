package task46_54.task48;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseFile {

    private final String name;
    private ArrayList<Integer> numberList;
    private Pattern pattern;
    private Matcher matcher;


    public UseFile(String filesName) {
        name = filesName;
        numberList = new ArrayList<>();
    }


    public void readMyFile() {
        try (
                FileReader fileReader = new FileReader(name);
                BufferedReader br = new BufferedReader(fileReader)
        ){
            searchNumber(br);
            sumNumber();
            deleteTheSameNumber();
        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        } catch (NumberFormatException e){
            System.out.println("Number format exception");
            System.out.println("The integer too large");
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("InputOutput exception");
        }
    }

    private void searchNumber(BufferedReader br) throws IOException {

        String str = br.readLine();
        pattern = Pattern.compile("[0-9]+");
        String number = "";
        int myNumber;

        do {
            matcher = pattern.matcher(str);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();

                for (int i = start; i < end; i++) {

                    char myStr = str.charAt(i);
                    number += myStr;
                    if (i == end - 1) {
                        myNumber = Integer.parseInt(number);

                        numberList.add(myNumber);
                        number = "";
                    }
                }
            }
            str = br.readLine();
        } while (str != null);
    }

    private void sumNumber() {

        int sum = 0;

        System.out.println("Numbers:");
        for (int num: numberList){
            System.out.print(num + " ");

            if((sum + num) < Integer.MAX_VALUE && (sum + num) > 0)
            sum += num;
            else {
                System.out.println("The integer too long");
                return;
            }
        }
        System.out.println("\nSum = " + sum);
    }

    private void deleteTheSameNumber() {
        Set<Integer> numberSet = new HashSet<>(numberList);
        for (Integer n: numberSet) {
            System.out.print(n + " ");
        }
    }
}
