package task24_25.task24;

public class Engine {

    public long totalNumberOfSecond(PeriodOfTime time){
        long totalNumberOfSecond = 0;

        if(time.getMinute() == 0 && time.getHour() == 0){
            totalNumberOfSecond = time.getSecond();

        } else if(time.getMinute() == 0) {
            if(time.getSecond() < Long.MAX_VALUE - ((long) time.getHour() * 60 * 60))
                totalNumberOfSecond = time.getSecond() + ((long) time.getHour() * 60 * 60);
            else System.out.println("Yours values (sec, hour) is too long");

        } else if(time.getHour() == 0){
            if(time.getSecond() < Long.MAX_VALUE - (time.getMinute() * 60L))
                totalNumberOfSecond = time.getSecond() + (time.getMinute() * 60L);
            else System.out.println("Yours values (min, sec) is too long");

        }else {
            if(time.getSecond() < Long.MAX_VALUE - ((long) time.getHour() * 60 * 60) - (time.getMinute() * 60L))
                totalNumberOfSecond = time.getSecond() + (time.getMinute() * 60L) + ((long) time.getHour() * 60 * 60);
            else System.out.println("Yours values (min, sec) is too long");
        }

        return totalNumberOfSecond;
    }

    public int compareTwoObjects(long time, long time2){
        String second;
        String second2;
        boolean ifTrue =  true;
        int stringLength;
        int result = 0;

        second = String.valueOf(time);
        second2 = String.valueOf(time2);

        if(second.length() > second2.length())
            stringLength = second.length();
        else stringLength = second2.length();

        while (ifTrue){
            for(int i = 0; i < stringLength; i++){
                if(second.charAt(i) < second2.charAt(i)){
                    result = (int)(Math.random() * 10 - 11);
                    ifTrue = false;
                    break;
                } else if (second.charAt(i) > second2.charAt(i)){
                    result = (int)(Math.random() * 10 + 11);
                    ifTrue = false;
                    break;
                } else if(second.charAt(second.length()-1) == second2.charAt(second2.length()-1)){
                    result = 0;
                    ifTrue = false;
                    break;
                }
            }
        }
        return result;
    }

}
