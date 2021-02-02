package org.launchcode.studio7;

public abstract class BaseDisc {

    double currentStorageCapacity;
    String discType;
    String name;

    public BaseDisc(String discType, String name){
        this.discType = discType;
        this.name = name;
    }



    public abstract double getCurrentStorageCapacity();
    public abstract String getDiscType();
    public abstract String getName();
}
