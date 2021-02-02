package org.launchcode.studio7;

public abstract class BaseDisc {


    private double currentStorageCapacity;
    private String discType;
    private String name;

    public abstract double getCurrentStorageCapacity();
    public abstract String getDiscType();
    public abstract String getName();
}
