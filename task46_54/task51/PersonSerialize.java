package task46_54.task51;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonSerialize {

    private Scanner scanner;
    private Person person;

    public PersonSerialize() {
        scanner = new Scanner(System.in);
    }

    private String getName(){
        System.out.println("Enter name: ");
        return scanner.nextLine();
    }

    private String getSurname(){
        System.out.println("Enter surname: ");
        return scanner.nextLine();
    }

    private int getAge(){
        try {
            System.out.println("Enter age: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        return -1;
    }

    public void writeSerializeObject(){

        try (FileOutputStream fos = new FileOutputStream("serializable");
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){

            for(int i = 0; i < 2; i++){
                person = new Person(getName(), getSurname(), getAge());
                oos.writeObject(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
