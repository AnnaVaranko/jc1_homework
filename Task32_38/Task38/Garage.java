package Task32_38.Task38;

import java.util.Scanner;

public class Garage <T extends Vehicle>{
    private String nameOfCar;
    private String nameOfMotorcycle;

    Vehicle[] vehicle = new Vehicle[2];

    public Vehicle[] getArrayOfVehicle(T car, T motorcycle ){
        for(int i = 0; i < vehicle.length; i ++){
            if(i == 0) vehicle[i] = car;
            else vehicle[i] = motorcycle;
        }

        return vehicle;
    }

    private void setName(){
        for(int i = 0; i < vehicle.length; i ++){
            if(i == 0) nameOfCar = vehicle[i].getName();
            else nameOfMotorcycle = vehicle[i].getName();
        }
    }

    public void outputName(){
        setName();
        System.out.println("Car's name is " + nameOfCar);
        System.out.println("Motorcycle's name is " + nameOfMotorcycle);
    }
}
