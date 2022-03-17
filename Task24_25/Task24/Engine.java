package Task24_25.Task24;

public class Engine {

    public long totalNumberOfSecond(PeriodOfTime time){
        long totalNumberOfSecond = 0;

        if(time.getMinute() == 0 && time.getHour() == 0){
            totalNumberOfSecond = time.getSecond();

        } else if(time.getMinute() == 0) {
            if(time.getSecond() < Long.MAX_VALUE - ((long) time.getHour() * 60 * 60))
                totalNumberOfSecond = time.getSecond() + ((long) time.getHour() * 60 * 60);
            else System.out.println("Yours values (sec, hour) is to long");

        } else if(time.getHour() == 0){
            if(time.getSecond() < Long.MAX_VALUE - (time.getMinute() * 60L))
                totalNumberOfSecond = time.getSecond() + (time.getMinute() * 60L);
            else System.out.println("Yours values (min, sec) is to long");

        }else {
            if(time.getSecond() < Long.MAX_VALUE - ((long) time.getHour() * 60 * 60) - (time.getMinute() * 60L))
                totalNumberOfSecond = time.getSecond() + (time.getMinute() * 60L) + ((long) time.getHour() * 60 * 60);
            else System.out.println("Yours values (min, sec) is to long");
        }

        return totalNumberOfSecond;
    }

    public int compareTwoObjects(long time, long time2){
        String second;
        String second2;

        second = String.valueOf(time);
        second2 = String.valueOf(time2);
        return second.compareTo(second2);
    }

}
