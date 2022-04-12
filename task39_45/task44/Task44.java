package task39_45.task44;

import java.util.Scanner;

public class Task44 {

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the even and not longer than eight-digit number: ");
        String myNumber = scanner.nextLine();

        if(myNumber.matches("[\\-]?\\d{1,8}")){
            return Integer.parseInt(myNumber);
        } else return  999_999_999;
    }

    public static void main(String[] args)  {

        int number = Task44.getNumber();

        try{
            if(number == 999_999_999) throw new IncorrectInputException();
            else if(number % 2 != 0) throw new NotEvenNumber(number);
            else System.out.println("The number is even");
        } catch (IncorrectInputException | NotEvenNumber exc){
            System.out.println(exc);
        }
    }
}
