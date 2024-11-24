package tum.seba.mobilityservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import tum.seba.mobilityservices.entity.*;
import java.util.Date;

@SpringBootApplication
public class SebaMobilityServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SebaMobilityServicesApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void execCodeAfterStartup() {
	
		// Instantiate your classes here and output their content to the console by calling their toString() method

		//Instantiations
		Rental rental = new Rental(new Date(2024-10-10), new Date(2024-10-12), Rental.Status.BOOKED);
		Invoice invoice = new Invoice(50.0, true);
		ServicePoint servicePoint = new ServicePoint("SP X", "StreetName", 99, "Muenchen");
		Vehicle vehicle = new Vehicle("ManufacturerX", "ModelTypeX", new Date(2023-10-10), true);

		//toString calls
		System.out.println(rental);
		System.out.println(invoice);
		System.out.println(servicePoint);
		System.out.println(vehicle);
	}


}
