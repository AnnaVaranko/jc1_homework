package task39_45.task42;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import task24_25.task25.FinishOperation;

public class MapDemo {

    FinishOperation fo = new FinishOperation();
    Map<String, Integer> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    String enteredWord;
    String text = enterTheText();

//    String text = "First come First will serve means whatever the job came first we should process that job first " +
//            "regardless other properties. This situation we can map with our real time scenario. When we are in queue " +
//            "for movie tickets, whoever the person first entered into queue will get the ticket first. Second person" +
//            " will be severed second only. Same strategy will be applied on scheduling also.";


    public void createMap() {
        newMyMap();
        getMap();
    }

    private String enterTheText() {

        System.out.println("Enter the text: ");
        String myText =  scanner.nextLine();
        System.out.println();

        return myText;
    }

    private void newMyMap() {

        while (fo.getFinishOperation()) {

            System.out.println("Enter the key: ");
            enteredWord = scanner.nextLine();

            list.add(enteredWord);
            map.put(enteredWord, getValue());
            fo.IsOperationFinished();
        }
    }

    private int getValue() {

        int count = 0;
        Pattern pattern = Pattern.compile(enteredWord.toLowerCase());
        Matcher matcher = pattern.matcher(text.toLowerCase());

        while (matcher.find()){
//            if(matcher.start() == 0 || matcher.end() == text.length())
//                continue;

            count++;
        }
        return count;
    }

    private void getMap() {
        System.out.println("My Map: ");

        for(int i = 0; i < list.size(); i++){
            System.out.println("Word: " + list.get(i) + ", " +
                    "number of repetitions in the text: " + map.get(list.get(i)) + ".");
        }
    }
}
