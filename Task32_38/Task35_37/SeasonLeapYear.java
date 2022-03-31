package Task32_38.Task35_37;

public enum SeasonLeapYear {
    SUMMER(92, "summer"), AUTUMN(91, "autumn"),
    WINTER(90, "winter"), SPRING(92, "spring");

    private final String description;
    private final int countOfDays;

    SeasonLeapYear(int countOfDays, String description){
        this.countOfDays = countOfDays;
        this.description = description;
    }

    public int getDays(){return countOfDays;}
    public String getDescription(){return description;}

}
