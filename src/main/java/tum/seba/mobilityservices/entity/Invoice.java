package tum.seba.mobilityservices.entity;

public class Invoice {

    //Attributes
    private Double price;
    private Boolean isPaid;
    //EndOfAttributes

    //Constructor
    public Invoice(Double price, Boolean isPaid) {
        this.price = price;
        this.isPaid = isPaid;
    }
    //EndOfConstructor

    //GettersAndSetters
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }
    //EndOfGettersAndSetters

    //toString
    @Override
    public String toString() {
        return "Invoice{" +
                "price=" + price +
                ", isPaid=" + isPaid +
                '}';
    }
    //EndOfToString

}
