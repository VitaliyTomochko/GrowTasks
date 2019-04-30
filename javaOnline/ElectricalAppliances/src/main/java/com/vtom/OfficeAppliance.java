package com.vtom;

public abstract class OfficeAppliance extends ElectricDevice {


    public OfficeAppliance() {
    }

    public OfficeAppliance(String name, int powerConsumption, boolean status) {
        super(name, powerConsumption, status);
    }

    @Override
    void connectToNetwork() {
        super.connectToNetwork();
    }
}
