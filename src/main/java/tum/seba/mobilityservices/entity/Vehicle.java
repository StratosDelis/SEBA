package tum.seba.mobilityservices.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleid;
	private String manufacturer;	
	private String modelType;
	private Date lastService;
	private boolean isAvailable;

	public Vehicle() {
	}

	public Vehicle(String manufacturer, String modelType, Date lastService, boolean isAvailable) {
		this.manufacturer = manufacturer;
		this.modelType = modelType;
		this.lastService = lastService;
		this.isAvailable = isAvailable;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public Date getLastService() {
		return lastService;
	}

	public void setLastService(Date lastService) {
		this.lastService = lastService;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Vehicle [manufacturer=" + manufacturer + ", modelType=" + modelType + ", lastService=" + lastService
				+ ", isAvailable=" + isAvailable + "]";
	}

}
