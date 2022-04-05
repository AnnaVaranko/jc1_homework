package Task32_38.Task38;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Install car's name: ");
        String nameOfCar = scanner.nextLine();
        System.out.println("Install motorcycle's name: ");
        String nameOfMotorcycle = scanner.nextLine();

        Vehicle car = new Car(nameOfCar);
        Vehicle motorcycle = new Motorcycle(nameOfMotorcycle);

        Garage<Vehicle> garage = new Garage<>();
        garage.getArrayOfVehicle(car, motorcycle);
        garage.outputName();
    }
}
