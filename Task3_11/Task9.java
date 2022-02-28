package Task3_11;

public class Task9 {

    String str;

    public String getDate(int day, int month, int year) {
        if (month > 0 && month < 13) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (day > 0 && day <= 30)
                        str = "Next day DD/MM/YYYY: " + (day + 1) + "/" + (month) + "/" + (year);
                    else if (day == 31)
                        str = "Next day DD/MM/YYYY: " + 1 + "/" + (month + 1) + "/" + (year);
                    else if (day < 1 | day > 31)
                        str = "No such date exists";
                    break;
                case 12:
                    if (day > 0 && day <= 30)
                        str = "Next day DD/MM/YYYY: " + (day + 1) + "/" + (month) + "/" + (year);
                    else if (day == 31)
                        str = "Next day DD/MM/YYYY: " + 1 + "/" + 1 + "/" + (year + 1) + " Happy new year!!";
                    else if (day < 1 | day > 31)
                        str = "No such date exists";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day > 0 && day <= 29)
                        str = "Next day DD/MM/YYYY: " + (day + 1) + "/" + (month) + "/" + (year);
                    else if (day == 30)
                        str = "Next day DD/MM/YYYY: " + 1 + "/" + (month + 1) + "/" + (year);
                    else if (day < 1 | day > 30)
                        str = "No such date exists";
                    break;
                case 2:
                    if (year % 4 == 0 && year % 400 == 0 && year % 100 != 0) {
                        if (day > 0 && day <= 28)
                            str = "Next day DD/MM/YYYY: " + (day + 1) + "/" + (month) + "/" + (year);
                        else if (day == 29)
                            str = "Next day DD/MM/YYYY: " + 1 + "/" + (month + 1) + "/" + (year);
                        else if (day < 1 | day > 29)
                            str = "No such date exists";
                    } else {
                        if (day > 0 && day <= 27)
                            str = "Next day DD/MM/YYYY: " + (day + 1) + "/" + (month) + "/" + (year);
                        else if (day == 28)
                            str = "Next day DD/MM/YYYY: " + 1 + "/" + (month + 1) + "/" + (year);
                        else if (day < 1 | day > 28)
                            str = "No such date exists";
                    }
                    break;
            }
        } else {
            str = "No such date exists";
        }
        return str;
    }

    public static void main(String[] args) {
        //enter positive int, (date) dd/mm/yyyy:
        System.out.println(new Task9().getDate(28, 2, 1235));
    }
}
