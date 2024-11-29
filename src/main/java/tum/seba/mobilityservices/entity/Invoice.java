package tum.seba.mobilityservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invoice {
	
	private double price;
	private boolean isPaid;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int invoiceId;
	
	public Invoice(double price, boolean isPaid) {
		this.price = price;
		this.isPaid = isPaid;
	}

	public Invoice() {
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
	
	@Override
	public String toString() {
		return "Invoice [price=" + price + ", isPaid=" + isPaid + "]";
	}

}
