package tum.seba.mobilityservices;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import tum.seba.mobilityservices.entity.Bicycle;
import tum.seba.mobilityservices.entity.Car;
import tum.seba.mobilityservices.entity.Customer;
import tum.seba.mobilityservices.entity.Employee;
import tum.seba.mobilityservices.entity.Invoice;
import tum.seba.mobilityservices.entity.Rental;
import tum.seba.mobilityservices.entity.Rental.Status;
import tum.seba.mobilityservices.entity.ServicePoint;
import tum.seba.mobilityservices.entity.User;
import tum.seba.mobilityservices.entity.Vehicle;

@SpringBootApplication
public class SebaMobilityServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SebaMobilityServicesApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void execCodeAfterStartup() {
	
		// Instantiate your classes here and output their content to the console by calling their toString() method
		
		// instantiate test data
		
		Rental testRental = new Rental(new Date(), new Date(), Status.BOOKED);
		Invoice testInvoice = new Invoice(120.50, true);
		ServicePoint testServicePoint = new ServicePoint("TUM Main Campus", "Arcisstr.", 21, "Munich");
		User testUser = new User("Max", "Test", "max.test@tum.de", "pw123", "Arcisstr.", 21, "Munich");
		Employee testEmployee = new Employee("Max", "Test", "max.test@tum.de", "pw123", "Arcisstr.", 21, "Munich", "0123456789", new Date());
		Customer testCustomer = new Customer("Max", "Test", "max.test@tum.de", "pw123", "Arcisstr.", 21, "Munich", "maxtest", new Date());
		Vehicle testVehicle = new Vehicle("TUM", "Vehicle", new Date(), true);
		Car testCar = new Car("TUM", "Car", new Date(), true, 5, 215, "gasoline", 10000);
		Bicycle testBicycle = new Bicycle("TUM", "eBike", new Date(), true, 10, true);

		
		// print out all instances to the console
		
		System.out.println(testRental.toString());
		System.out.println(testInvoice.toString());
		System.out.println(testServicePoint.toString());
		System.out.println(testUser.toString());
		System.out.println(testEmployee.toString());
		System.out.println(testCustomer.toString());
		System.out.println(testVehicle.toString());
		System.out.println(testCar.toString());
		System.out.println(testBicycle.toString());
		
	}

}
