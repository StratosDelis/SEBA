package tum.seba.mobilityservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.Date;
import java.util.List;
@Entity
public class Employee extends User {

	@ManyToMany
	private List<ServicePoint> servicePoints;
	private String phoneNumber;
	private Date employmentDate;
	
	public Employee(String firstName, String lastName, String email, String password, String streetName,
			int houseNumber, String city, String phoneNumber, Date employmentDate) {
		super(firstName, lastName, email, password, streetName, houseNumber, city);
		this.phoneNumber = phoneNumber;
		this.employmentDate = employmentDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}

	public List<ServicePoint> getServicePoints() {
		return servicePoints;
	}

	public void setServicePoints(List<ServicePoint> servicePoints) {
		this.servicePoints = servicePoints;
	}

	@Override
	public String toString() {
		return "Employee [phoneNumber=" + phoneNumber + ", employmentDate=" + employmentDate + "]";
	}

}
