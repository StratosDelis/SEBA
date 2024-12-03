package tum.seba.mobilityservices.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ServicePoint {
	@ManyToMany
	private List<Employee> employees;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "startLocation", cascade = CascadeType.ALL)
	private List<Rental> rentalsStart;

	@OneToMany(mappedBy = "endLocation", cascade = CascadeType.ALL)
	private List<Rental> rentalsEnd;

	private String name;
	private String streetName;
	private int houseNumber;
	private String city;
	
	public ServicePoint() {}
	
	public ServicePoint(String name, String streetName, int houseNumber, String city) {
		this.name = name;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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


	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;}
		//Setters and Getters

	public List<Rental> getRentalsStart() {
		return rentalsStart;
	}

	public void setRentalsStart(List<Rental> rentalsStart) {
		this.rentalsStart = rentalsStart;
	}

	public List<Rental> getRentalsEnd() {
		return rentalsEnd;
	}

	public void setRentalsEnd(List<Rental> rentalsEnd) {
		this.rentalsEnd = rentalsEnd;
	}

	@Override
	public String toString() {
		return "ServicePoint [id=" + id + ", name=" + name + ", streetName=" + streetName + ", houseNumber="
				+ houseNumber + ", city=" + city + "]";
	}

}
