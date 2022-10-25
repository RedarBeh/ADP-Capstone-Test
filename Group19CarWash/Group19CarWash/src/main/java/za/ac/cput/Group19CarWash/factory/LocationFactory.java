/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
LocationFactory.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.factory;

import za.ac.cput.Group19CarWash.domain.Location;
import za.ac.cput.Group19CarWash.util.Helper;

public class LocationFactory {
    public static Location createLocation(String branchName, String branchCellno, String branchId){
        //String branchId = Helper.generatebranchId();
        // String delivBId = Helper.generateDelBId();

        Location location = new Location.Builder()
                .setBranchName(branchName)
                .setBranchId(branchId)
                .setBranchCellno(branchCellno)
                .build();
        return location;
    }
}
