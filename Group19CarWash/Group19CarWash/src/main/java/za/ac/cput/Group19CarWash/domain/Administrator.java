package za.ac.cput.Group19CarWash.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity

public class Administrator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long adminId;
    @Column
    private String adminFname;
    @Column
    private String adminSname;
    @Column
    private String bookingId;

    public Administrator() {}
    public Administrator(Builder builder) {
        this.adminId = builder.adminId;
        this.adminFname = builder.adminFname;
        this.adminSname = builder.adminSname;
        this.bookingId = builder.bookingId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminFname() {
        return adminFname;
    }

    public void setAdminFname(String adminFname) {
        this.adminFname = adminFname;
    }

    public String getAdminSname() {
        return adminSname;
    }

    public void setAdminSname(String adminSname) {
        this.adminSname = adminSname;
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
                "adminId='" + adminId + '\'' +
                ", adminFname='" + adminFname + '\'' +
                ", adminSname='" + adminSname + '\'' +
                ", bookingId='" + bookingId + '\'' +
                '}';
    }

    public static class Builder{
        private Long adminId;
        private String adminFname;
        private String adminSname;
        private String bookingId;

        public Builder setAdminId(Long adminId){
            this.adminId = adminId;
            return this;
        }
        public Builder setAdminFname(String adminFname){
            this.adminFname = adminFname;
            return this;
        }
        public Builder setAdminSname(String adminSname){
            this.adminSname = adminSname;
            return this;
        }
        public Builder setBookingId(String bookingId){
            this.bookingId = bookingId;
            return this;
        }
        public Builder copy(Administrator administrator){
            this.adminId = administrator.adminId;
            this.adminFname = administrator.adminFname;
            this.adminSname = administrator.adminSname;
            this.bookingId = administrator.bookingId;
            return this;
        }
        public Administrator build(){return new Administrator(this);}

    }

}
