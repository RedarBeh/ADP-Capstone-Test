package za.ac.cput.Group19CarWash.domain;
import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity

public class Cleaner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String CleanerId;
    @Column
    private String CleanerFname;
    @Column
    private String CleanerSname;
    @Column
    private String bookingId;

    public Cleaner() {
    }

    public Cleaner(Builder builder) {
        this.id = builder.id;
        this.CleanerId = builder.CleanerId;
        this.CleanerFname = builder.CleanerFname;
        this.CleanerSname = builder.CleanerSname;
        this.bookingId = builder.bookingId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminId() {
        return CleanerId;
    }

    public void setCleanerId(String adminId) {
        this.CleanerId = CleanerId;
    }

    public String getCleanerFname() {
        return CleanerFname;
    }

    public void setCleanerFname(String CleanerFname) {
        this.CleanerFname = CleanerFname;
    }

    public String getCleanerSname() {
        return CleanerSname;
    }

    public void setCleanerSname(String CleanerSname) {
        this.CleanerSname = CleanerSname;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "Id=" + id +
                "CleanerId='" + CleanerId + '\'' +
                ", CleanerFname='" + CleanerFname + '\'' +
                ", Cleanername='" + CleanerSname + '\'' +
                ", bookingId='" + bookingId + '\'' +
                '}';
    }

    public String getCleanerId() {
        return null;
    }

    public static class Builder{

        private Long id;
        public String CleanerId;
        private String CleanerFname;
        private String CleanerSname;
        private String bookingId;

        public Builder setId(Long Id){
            this.id = Id;
            return this;
        }
        public Builder setCleanerId(String CleanerId){
            this.CleanerId = CleanerId;
            return this;
        }
        public Builder setCleanerFname(String CleanerFname){
            this.CleanerFname = CleanerFname;
            return this;
        }
        public Builder setCleanerSname(String CleanerSname){
            this.CleanerSname = CleanerSname;
            return this;
        }
        public Builder setBookingId(String bookingId){
            this.bookingId = bookingId;
            return this;
        }
        public Builder copy(Cleaner cleaner){
            this.id = cleaner.id;
            this.CleanerId = cleaner.CleanerId;
            this.CleanerFname = cleaner.CleanerFname;
            this.CleanerSname = cleaner.CleanerSname;
            this.bookingId = cleaner.bookingId;
            return this;
        }
        public Cleaner build(){return new Cleaner(this);}

    }

}
