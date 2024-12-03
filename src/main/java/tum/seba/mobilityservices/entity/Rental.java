package tum.seba.mobilityservices.entity;

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

	@Override
	public String toString() {
		return "Rental [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status + "]";
	}

}
