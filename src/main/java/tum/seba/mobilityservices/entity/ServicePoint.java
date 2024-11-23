package tum.seba.mobilityservices.entity;

public class ServicePoint {
    private String name ;
    private String streetName;
    private int houseNumber;
    private String city;

    public ServicePoint(String name, String streetName, int houseNumber, String city) {
        this.name = name;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "ServicePoint{" +
                "name='" + name + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                '}';
    }

}
