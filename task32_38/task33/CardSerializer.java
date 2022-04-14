package task32_38.task33;

import java.io.*;

public class CardSerializer {

    public static void serialize(Card card)  {
        try (
                FileOutputStream fos = new FileOutputStream("Card.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){
            oos.writeObject(card);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Card deserialize(){
        try (
                FileInputStream fis = new FileInputStream("Card.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ){
            Object obj = ois.readObject();
            return (Card)obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Card card1 = new Card("black", 4.0, 5.0);
        System.out.println(card1);
        System.out.println(card1.i);//static field
        serialize(card1);
        Card.i = 2;

        Card card2 = deserialize();
        System.out.println(card2);
        System.out.println(card2.i);//static field
        try {
            System.out.println("Color: " + card2.color);//transient field
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
