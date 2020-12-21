package tum.seba.mobilityservices.entity;

import java.util.Date;

public class Rental {

	public enum Status {BOOKED, COMPLETED, CANCELED}

	private Date startTime;	
	private Date endTime;	
	private Status status;
	
	public Rental(Date startTime, Date endTime, Status status) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
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
		return "Rental [startTime=" + startTime + ", endTime=" + endTime + ", status=" + status + "]";
	}

}
