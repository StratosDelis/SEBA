package tum.seba.mobilityservices.entity;

public class Car extends Vehicle {

    //Attributes
    private int numberOfSeats;
    private int horsePower;
    private String fuelType;
    private int currentMileage;
    //EndOfAttributes

    //Constructor
    public Car(String manufacturer, String modelType, String lastService, boolean isAvailable, int numberOfSeats, int horsePower, String fuelType, int currentMileage) {

        super(manufacturer, modelType, lastService, isAvailable);
        this.numberOfSeats = numberOfSeats;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.currentMileage = currentMileage;
    }
    //EndOfConstructor

    //GettersAndSetters
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(int currentMileage) {
        this.currentMileage = currentMileage;
    }
    //EndOfGettersAndSetters

    //toString
    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", horsePower=" + horsePower +
                ", fuelType='" + fuelType + '\'' +
                ", currentMileage=" + currentMileage +
                '}';
    }
    //EndOfToString
}
