package tum.seba.mobilityservices.entity;

public class Vehicle {

    //Attributes
    private String manufacturer;
    private String modelType;
    private String lastService;
    private boolean isAvailable;
    //EndOfAttributes

    //Constructor
    public Vehicle(String manufacturer, String modelType, String lastService, boolean isAvailable) {
        this.manufacturer = manufacturer;
        this.modelType = modelType;
        this.lastService = lastService;
        this.isAvailable = isAvailable;
    }
    //EndOfConstructor

    //GettersAndSetters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getLastService() {
        return lastService;
    }

    public void setLastService(String lastService) {
        this.lastService = lastService;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    //EndOfGettersAndSetters

    //toString
    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelType='" + modelType + '\'' +
                ", lastService='" + lastService + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
    //EndOfToString
}
