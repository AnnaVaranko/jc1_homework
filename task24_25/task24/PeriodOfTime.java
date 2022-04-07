package task24_25.task24;

public class PeriodOfTime {
    private int hour = 0;
    private int minute = 0;
    private int second;

    PeriodOfTime(int sec){
        second = sec;
    }

    PeriodOfTime(int sec, int min, int hour){
        second = sec;
        minute = min;
        this.hour = hour;
    }

    public int getSecond(){
        return second;
    }
    public int getMinute(){
        return minute;
    }
    public int getHour(){
        return hour;
    }
}
