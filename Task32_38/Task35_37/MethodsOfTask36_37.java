package Task32_38.Task35_37;

import java.util.Scanner;

public class MethodsOfTask36_37 {

    public int userInput;

    private void getUserChoice() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter id of the season:\n" +
                "1 - summer, 2 - autumn, 3 - winter, 4 - spring.");
        String seasonId = scanner.nextLine();

        switch (seasonId) {
            case "1":
                userInput = 1;
                break;
            case "2":
                userInput = 2;
                break;
            case "3":
                userInput = 3;
                break;
            case "4":
                userInput = 4;
                break;
            default:
                System.out.println("Incorrect input");
        }
    }

    public void getNextSeason() {

        System.out.println("\nOutput next season: ");

        getUserChoice();
        switch (userInput) {
            case 1:
                System.out.println("Next season is " + SeasonLeapYear.AUTUMN.getDescription());
                break;
            case 2:
                System.out.println("Next season is " + SeasonLeapYear.WINTER.getDescription());
                break;
            case 3:
                System.out.println("Next season is " + SeasonLeapYear.SPRING.getDescription());
                break;
            case 4:
                System.out.println("Next season is " + SeasonLeapYear.SUMMER.getDescription());
                break;
        }
    }

    public void getCountOfDays() {

        System.out.println("\nOutput number days of the season:  ");

        getUserChoice();
        switch (userInput) {
            case 1:
                System.out.println("Number day in the season is " + SeasonLeapYear.SUMMER.getDays());
                break;
            case 2:
                System.out.println("Number day in the season is " + SeasonLeapYear.AUTUMN.getDays());
                break;
            case 3:
                System.out.println("Number day in the season is " + SeasonLeapYear.WINTER.getDays());
                break;
            case 4:
                System.out.println("Number day in the season is " + SeasonLeapYear.SPRING.getDays());
                break;
        }
    }
}