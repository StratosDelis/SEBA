package tum.seba.mobilityservices.entity;

public class Invoice {
	
	private double price;
	private boolean isPaid;
	
	public Invoice(double price, boolean isPaid) {
		this.price = price;
		this.isPaid = isPaid;
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
