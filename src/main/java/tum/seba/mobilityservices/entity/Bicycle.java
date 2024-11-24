package tum.seba.mobilityservices.entity;

public class Bicycle extends Vehicle{

    //Attributes
    private int numberOfGears;
    private boolean isElectrical;
    //EndOfAttributes

    //Constructor
    public Bicycle(String manufacturer, String modelType, String lastService, boolean isAvailable, int numberOfGears, boolean isElectrical) {
        super(manufacturer, modelType, lastService, isAvailable);
        this.numberOfGears = numberOfGears;
        this.isElectrical = isElectrical;
    }
    //EndOfConstructor

    //GettersAndSetters
    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public boolean isElectrical() {
        return isElectrical;
    }

    public void setElectrical(boolean electrical) {
        isElectrical = electrical;
    }
    //EndOfGettersAndSetters

    //toString
    @Override
    public String toString() {
        return "Bicycle{" +
                "numberOfGears=" + numberOfGears +
                ", isElectrical=" + isElectrical +
                '}';
    }
    //EndOftoString
}
