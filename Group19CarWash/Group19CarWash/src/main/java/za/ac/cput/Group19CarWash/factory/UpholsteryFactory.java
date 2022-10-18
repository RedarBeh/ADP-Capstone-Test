package za.ac.cput.Group19CarWash.factory;

import za.ac.cput.Group19CarWash.domain.Upholstery;

public class UpholsteryFactory {

    public static Upholstery createUpholstery(String upholstItem, String upholstMaterial, String upholstColour){

        //Long Id = Helper.generateId();
        Upholstery upholstery = new Upholstery.Builder()
                .setUpholstItem(upholstItem)
                .setUpholstMaterial(upholstMaterial)
                .setUpholstColour(upholstColour)
                .build();
        return upholstery;
    }
}
