package task46_54.task48;

import task46_54.task46.Task46;

public class Task48 {
    public static void main(String[] args) {
        UseFile useFile = new UseFile(new Task46().getFile());
        useFile.readMyFile();
    }
}
