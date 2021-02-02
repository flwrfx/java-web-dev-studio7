package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {



    public CD(String discType, String name) {
        super(discType, name);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void readData() {

    }

    @Override
    public double getTotalStorageCapacity() {
        return 0;
    }

    @Override
    public double getCurrentStorageCapacity() {
        return this.currentStorageCapacity;
    }

    @Override
    public String getDiscType() {
        return this.discType;
    }

    @Override
    public String getName() {
        return this.name;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
