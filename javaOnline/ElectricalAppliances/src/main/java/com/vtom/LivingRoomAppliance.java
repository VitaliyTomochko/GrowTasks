package com.vtom;

public abstract class LivingRoomAppliance extends ElectricDevice {


    public LivingRoomAppliance(String name, int powerConsumption, boolean status) {
        super(name, powerConsumption, status);
    }

    @Override
    void connectToNetwork() {
        super.connectToNetwork();
    }
}
