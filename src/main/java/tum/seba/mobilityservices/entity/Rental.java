package tum.seba.mobilityservices.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rental {

	public enum Status {BOOKED, COMPLETED, CANCELED}
	
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

	@Override
	public String toString() {
		return "Rental [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status + "]";
	}

}
