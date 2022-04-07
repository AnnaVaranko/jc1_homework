package task4_11;
public class Task11 {
    String str;
    String monday = "Go to the gym";
    String tuesday = "Go to it-academy";
    String wednesday = "Go to the gym";
    String thursday = "Go to it-academy";
    String friday = "Go to the gym";
    String saturday = "Meet my bestie";
    String sunday = "Meet my bestie";

    public String getPlaneOfDay(int dayOfTheWeek) {
        switch (dayOfTheWeek) {
            case 1:
                str = monday;
                break;
            case 2:
                str = tuesday;
                break;
            case 3:
                str = wednesday;
                break;
            case 4:
                str = thursday;
                break;
            case 5:
                str = friday;
                break;
            case 6:
                str = saturday;
                break;
            case 7:
                str = sunday;
                break;
            default:
                str = "This day is not exist";
        }
        return str;

    }
        public static void main (String[] args){
            System.out.println(new Task11().getPlaneOfDay(3));
        }
    }
