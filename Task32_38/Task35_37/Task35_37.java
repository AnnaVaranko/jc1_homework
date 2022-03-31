package Task32_38.Task35_37;

public class Task35_37 {

    public static void main(String[] args) {
        SeasonLeapYear[] s = SeasonLeapYear.values();
        for (SeasonLeapYear season: s) {
            System.out.println(season);
        }

        MethodsOfTask36_37 m = new MethodsOfTask36_37();

        m.getNextSeason();
        m.getCountOfDays();

    }
}
