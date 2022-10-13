/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
Location.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.domain;

import javax.persistence.*;

@Entity
@Table
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String branchId;
    @Column
    private String branchLoca;
    @Column
    private String branchName;
    @Column
    private String branchCellno;
    @Column
    private String delivBId;


    public Location(){}
    //////////////////////Private constructors


    public Location(Long id, String branchId, String branchLoca, String branchName, String branchCellno, String delivBId) {
        id = id;
        this.branchId = branchId;
        this.branchLoca = branchLoca;
        this.branchName = branchName;
        this.branchCellno = branchCellno;
        this.delivBId = delivBId;
    }


    public Location(Location.Builder builder) {}
    //////////////////////// Getters And Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchLoca() {
        return branchLoca;
    }

    public void setBranchLoca(String branchLoca) {
        this.branchLoca = branchLoca;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCellno() {
        return branchCellno;
    }

    public void setBranchCellno(String branchCellno) {
        this.branchCellno = branchCellno;
    }

    public String getDelivBId() {
        return delivBId;
    }

    public void setDelivBId(String delivBId) {
        this.delivBId = delivBId;
    }


    ///////////////////////// To String


    @Override
    public String toString() {
        return "Location{" +
                "Id=" + id +
                ", branchId='" + branchId + '\'' +
                ", branchLoca='" + branchLoca + '\'' +
                ", branchName='" + branchName + '\'' +
                ", branchCellno='" + branchCellno + '\'' +
                ", delivBId='" + delivBId + '\'' +
                '}';
    }

    //////////////////////////////Builder Set
    public static class Builder {
        private Long id;
        private String branchId;
        private String branchLoca;
        private String branchName;
        private String branchCellno;
        private String delivBId;


        public Location.Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Location.Builder setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }

        public Location.Builder setBranchLoca(String branchLoca) {
            this.branchLoca = branchLoca;
            return this;
        }

        public Location.Builder setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        public Location.Builder setBranchCellno(String branchCellno) {
            this.branchCellno = branchCellno;
            return this;
        }

        public Location.Builder setDelivBId(String delivBId) {
            this.delivBId = delivBId;
            return this;
        }

        public Location.Builder copy(Location location) {
            this.id = location.id;
            this.branchId = location.branchId;
            this.branchLoca = location.branchLoca;
            this.branchName = location.branchName;
            this.branchCellno = location.branchCellno;
            this.delivBId = location.delivBId;
            return this;
        }

        public Location build() {
            return new Location(this);
        }
    }
}
