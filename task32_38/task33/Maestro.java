package task32_38.task33;

public class Maestro extends Card{
    private String emblem = "Maestro";

    public Maestro(String color, double height, double width) {
        super(color, height, width);
    }

    public void getPlaceOfEmblem(){
        System.out.println("Emblem placed in upper right corner.");
    }

    public void getPlaceOfDataCardHolder(){
        System.out.println("Name and Lastname of card holder, card expiration date, card number" +
                " placed in front side.");
        System.out.println("Unique three-digit number and signature " +
                "placed in flip side.");
    }
}
