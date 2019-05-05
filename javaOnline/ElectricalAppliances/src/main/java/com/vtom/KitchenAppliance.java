package com.vtom;

public abstract class KitchenAppliance extends ElectricDevice {

    public KitchenAppliance(String name, int powerConsumption, boolean status) {
        super(name, powerConsumption, status);
    }



    @Override
    void connectToNetwork() {
        super.connectToNetwork();
    }
}
