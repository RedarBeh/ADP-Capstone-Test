package za.ac.cput.Group19CarWash.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table

public class Services implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long servicesId;
    @Column
    private String servicesPkg;
    @Column
    private String washTypeId;
    @Column
    private String upholsteryId;
    @Column
    private String customerId;
    @Column
    private String cleanerId;
    @Column
    private String totalAmount;

    public Services(){}
    public Services(Builder builder) {
        this.servicesId = builder.servicesId;
        this.servicesPkg = builder.servicesPkg;
        this.washTypeId = builder.washTypeId;
        this.upholsteryId = builder.upholsteryId;
        this.customerId = builder.customerId;
        this.cleanerId = builder.cleanerId;
        this.totalAmount = builder.totalAmount;
    }

    public Long getServicesId() {
        return servicesId;
    }

    public Services setServicesId(Long serviceId) {
        this.servicesId = serviceId;
        return this;
    }

    public String getServicesPkg() {
        return servicesPkg;
    }

    public Services setServicesPkg(String servicePkg) {
        this.servicesPkg = servicePkg;
        return this;
    }

    public String getWashTypeId() {
        return washTypeId;
    }

    public Services setWashTypeId(String washTypeId) {
        this.washTypeId = washTypeId;
        return this;
    }

    public String getUpholsteryId() {
        return upholsteryId;
    }

    public Services setUpholsteryId(String upholsteryId) {
        this.upholsteryId = upholsteryId;
        return this;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Services setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCleanerId() {
        return cleanerId;
    }

    public Services setCleanerId(String cleanerId) {
        this.cleanerId = cleanerId;
        return this;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public Services setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    @Override
    public String toString() {
        return "Services{" +
                "serviceId=" + servicesId +
                ", servicePkg='" + servicesPkg + '\'' +
                ", washTypeId='" + washTypeId + '\'' +
                ", upholsteryId='" + upholsteryId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", cleanerId='" + cleanerId + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                '}';
    }

    public static class Builder{
        private Long servicesId;
        private String servicesPkg;
        private String washTypeId;
        private String upholsteryId;
        private String customerId;
        private String cleanerId;
        private String totalAmount;

        public Builder setservicesId(Long servicesId){
            this.servicesId = servicesId;
            return this;
        }
        public Builder setservicesPkg(String servicesPkg){
            this.servicesPkg = servicesPkg;
            return this;
        }
        public Builder setwashTypeId(String washTypeId){
            this.washTypeId = washTypeId;
            return this;
        }
        public Builder setupholsteryId(String upholsteryId){
            this.upholsteryId = upholsteryId;
            return this;
        }
        public Builder setcustomerId(String customerId){
            this.customerId = customerId;
            return this;
        }
        public Builder setcleanerId(String cleanerId){
            this.cleanerId = cleanerId;
            return this;
        }
        public Builder settotalAmount(String totalAmount){
            this.totalAmount = totalAmount;
            return this;
        }
        public Builder copy(Services services){
            this.servicesId = servicesId;
            this.servicesPkg = servicesPkg;
            this.washTypeId = washTypeId;
            this.upholsteryId = upholsteryId;
            this.customerId = customerId;
            this.cleanerId = cleanerId;
            this.totalAmount = totalAmount;
            return this;
        }
        public Services build(){return new Services(this);}
    }

}
