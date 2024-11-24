package tum.seba.mobilityservices.entity;

public class User {
    //Attributes//
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String streetName;
    private int houseNumber;
    private String city;
    //EndOfAttributes//

    //Constructor//

    public User(String firstName,
                String lastName, String email,
                String password,
                String streetName,
                int houseNumber,
                String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
    }

    //EndOfConstructor//

    //GettersAndSetters//

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
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
    //EndOfGettersAndSetters//

    //please

    //toString Method//
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                '}';
    }
    //EndOfToString//

}
