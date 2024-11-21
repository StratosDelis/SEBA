package tum.seba.mobilityservices.entity;
import java.util.Date;
public class Rental {
    enum Status {
        BOOKED,
        COMPLETED,
        CANCELLED
    }
    private Date startTime;
    private Date endTime;
    private Status status ;

    @Override
    public String toString() {
        return "Rental{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                '}';
    }

    public Rental() {

    }
    public Status getStatus() {
        return status;
    }
    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
