package tum.seba.mobilityservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SebaMobilityServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SebaMobilityServicesApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void execCodeAfterStartup() {
	
		// Instantiate your classes here and output their content to the console by calling their toString() method
		
	}

}
//kjdjfej