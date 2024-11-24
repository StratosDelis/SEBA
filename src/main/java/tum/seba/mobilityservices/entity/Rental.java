package tum.seba.mobilityservices.entity;
import java.util.Date;
public class Rental {

    //ENUM
    enum Status {
        BOOKED,
        COMPLETED,
        CANCELLED
    }
    //EndOfENUM

    //Attributes
    private Date startTime;
    private Date endTime;
    private Status status ;
    //EndOfAttributes

    //Constructor
    public Rental(Date startTime, Date endTime, Status status) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }
    //EndOfConstructor

    //GettersAndSetters
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
    //EndOfGettersAndSetters

    //toString
    @Override
    public String toString() {
        return "Rental{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                '}';
    }
    //EndOfToString
}
