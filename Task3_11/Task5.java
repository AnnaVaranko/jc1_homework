package Task3_11;

public class Task5 {
    //amount of time in seconds
    int amountOfTime = 51546546;

    int seconds, minutes, hours, days, weeks;
    String str;

    public String getTime() {
        seconds = amountOfTime;
        minutes = seconds / 60;
        hours = minutes / 60;
        days = hours / 24;
        weeks = days / 7;
        str = "There are " + seconds + " seconds, " +
                minutes + " minutes, " +
                hours + " hours, " +
                days + " days, " +
                weeks + " weeks " +
                "in the amount of time in seconds " + amountOfTime + ".";
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new Task5().getTime());
    }
}
