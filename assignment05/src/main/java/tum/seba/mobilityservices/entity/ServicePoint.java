package tum.seba.mobilityservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ServicePoint {
	
	private String name;
	private String streetName;
	private int houseNumber;
	private String city;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int servicePointId;
	
	public ServicePoint(String name, String streetName, int houseNumber, String city) {
		this.name = name;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.city = city;
	}

	public ServicePoint() {
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ServicePoint [name=" + name + ", streetName=" + streetName + ", houseNumber=" + houseNumber
				+ ", city=" + city + "]";
	}

}
