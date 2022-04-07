package task24_25.task24;

public class Task24 {
    public static void main(String[] args) {


        PeriodOfTime time = new PeriodOfTime(3050);
        PeriodOfTime time2 = new PeriodOfTime(3050, 0, 0);

        Engine e = new Engine();

        long second = e.totalNumberOfSecond(time);
        System.out.println(second);

        long second1 = e.totalNumberOfSecond(time2);
        System.out.println(second1);

        System.out.println(e.compareTwoObjects(second, second1));


    }
}