package tum.seba.mobilityservices.entity;

import java.security.Provider;
import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Rental {
	public enum Status {BOOKED, COMPLETED, CANCELED}
	@ManyToOne
	private Customer customer;

	@OneToOne(mappedBy="rentalId", cascade = CascadeType.ALL)
	private Invoice invoice;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private ServicePoint startLocation;

	@ManyToOne
	private ServicePoint endLocation;

	@ManyToOne
	private Vehicle vehicle;

	private Date startTime;
	private Date endTime;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Rental() {}
	
	public Rental(Date startTime, Date endTime, Status status) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Invoice getInvoice() {
		return invoice;
	}
	public ServicePoint getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(ServicePoint startLocation) {
		this.startLocation = startLocation;
	}

	public ServicePoint getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(ServicePoint endLocation) {
		this.endLocation = endLocation;

	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Rental [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status + "]";
	}

}
