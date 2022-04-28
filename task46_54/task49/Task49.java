package task46_54.task49;

import task46_54.task46.Task46;

public class Task49 {
    public static void main(String[] args) {
        DemoDataOutputStream demoDataOutputStream = new DemoDataOutputStream(new Task46().getFile());
        demoDataOutputStream.work();
    }
}
