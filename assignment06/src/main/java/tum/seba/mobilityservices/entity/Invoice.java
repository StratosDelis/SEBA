package tum.seba.mobilityservices.entity;

import jakarta.persistence.*;

@Entity
public class Invoice {
	@OneToOne
	private Rental rental;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double price;
	private boolean isPaid;
	
	public Invoice() {}
	
	public Invoice(double price, boolean isPaid) {
		this.price = price;
		this.isPaid = isPaid;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isPaid() {
		return isPaid;
	}
	
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", price=" + price + ", isPaid=" + isPaid + "]";
	}

}
