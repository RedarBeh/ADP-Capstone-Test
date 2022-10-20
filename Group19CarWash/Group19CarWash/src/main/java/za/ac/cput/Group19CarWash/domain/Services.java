package za.ac.cput.Group19CarWash.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table

public class Services implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String servicesId;
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
        this.id = builder.id;
        this.servicesId = builder.servicesId;
        this.servicesPkg = builder.servicesPkg;
        this.washTypeId = builder.washTypeId;
        this.upholsteryId = builder.upholsteryId;
        this.customerId = builder.customerId;
        this.cleanerId = builder.cleanerId;
        this.totalAmount = builder.totalAmount;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServicesId() {
        return servicesId;
    }

    public void setServicesId(String servicesId) {this.servicesId = servicesId;}

    public String getServicesPkg() {
        return servicesPkg;
    }

    public void setServicesPkg(String servicesPkg) {
        this.servicesPkg = servicesPkg;
    }

    public String getWashTypeId() {
        return washTypeId;
    }

    public void setWashTypeId(String washTypeId) {this.washTypeId = washTypeId;}

    public String getUpholsteryId() {
        return upholsteryId;
    }

    public void setUpholsteryId(String upholsteryId) {this.upholsteryId = upholsteryId;}

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {this.customerId = customerId;}

    public String getCleanerId() {
        return cleanerId;
    }

    public void setCleanerId(String cleanerId) {this.cleanerId = cleanerId;}

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {this.totalAmount = totalAmount;}

    @Override
    public String toString() {
        return "Services{" +
                "Id=" + id +
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
        private Long id;
        private String servicesId;
        private String servicesPkg;
        private String washTypeId;
        private String upholsteryId;
        private String customerId;
        private String cleanerId;
        private String totalAmount;

        public Builder setId(Long Id){
            this.id = Id;
            return this;
        }
        public Builder setServicesId(String servicesId){
            this.servicesId = servicesId;
            return this;
        }
        public Builder setServicesPkg(String servicesPkg){
            this.servicesPkg = servicesPkg;
            return this;
        }
        public Builder setWashTypeId(String washTypeId){
            this.washTypeId = washTypeId;
            return this;
        }
        public Builder setUpholsteryId(String upholsteryId){
            this.upholsteryId = upholsteryId;
            return this;
        }
        public Builder setCustomerId(String customerId){
            this.customerId = customerId;
            return this;
        }
        public Builder setCleanerId(String cleanerId){
            this.cleanerId = cleanerId;
            return this;
        }
        public Builder setTotalAmount(String totalAmount){
            this.totalAmount = totalAmount;
            return this;
        }
        public Builder copy(Services services){
            this.id = services.id;
            this.servicesId = services.servicesId;
            this.servicesPkg = services.servicesPkg;
            this.washTypeId = services.washTypeId;
            this.upholsteryId = services.upholsteryId;
            this.customerId = services.customerId;
            this.cleanerId = services.cleanerId;
            this.totalAmount = services.totalAmount;
            return this;
        }
        public Services build(){return new Services(this);}
    }

}
