package task32_38.task33;

public class MaestroBlack extends Maestro{

    MaestroBlack(String color, double height, double width){
        super(color, height,width);
    }

    @Override
    public void getPlaceOfEmblem() {
        System.out.println("Emblem placed in the middle of the card in front side.");
    }

    @Override
    public void getPlaceOfDataCardHolder() {
        System.out.println("Name and Lastname of card holder, card expiration date, card number, " +
                "unique three-digit number and signature " +
                "placed in flip side.");
    }
}
