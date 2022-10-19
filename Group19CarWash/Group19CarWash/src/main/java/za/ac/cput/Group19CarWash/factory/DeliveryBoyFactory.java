package za.ac.cput.Group19CarWash.factory;

/*
Mogammad-Redar Behardien 216234107
ADP3 ASSIGNMENT1
DD: 10 APRIL 2022
DeliveryBoyFactory.java
**************** DO NOT TOUCH ********************
 */

import za.ac.cput.Group19CarWash.domain.DeliveryBoy;

public class DeliveryBoyFactory {
    public static DeliveryBoy createDeliveryBoy(String delivBFname, String delivBSname, // String delivBId,
            String delivBCellNr) {
        DeliveryBoy deliveryBoy = new DeliveryBoy.Builder()
                // .setDelivBId(delivBId)
                .setDelivBFname(delivBFname)
                .setDelivBSname(delivBSname)
                .setDelivBCellNr(delivBCellNr)
                .build();
        return deliveryBoy;
    }
}