package task.FileHelp;

public class FileHelp {
    public static void main(String[] args) {

        Help hlpObj = new Help("helpfile.txt");
        String topic;

        System.out.println("Воспользуйтесь справочной системой.\n" +
                "Для выхода из системы введите 'stop'.");

        do{
            topic = hlpObj.getSelection();

            if(!hlpObj.helpOn(topic))
                System.out.println("\n");
        } while (topic.compareTo("stop") != 0);
    }
}
