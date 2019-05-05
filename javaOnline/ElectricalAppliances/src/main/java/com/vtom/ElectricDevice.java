package com.vtom;

public class ElectricDevice extends NetworkAppliance {

    private String name;
    //private String manufacturer;
    private int powerConsumption;
    private boolean status;


    public ElectricDevice(String name, int powerConsumption, boolean status) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    void connectToNetwork() {
        this.status = true;
    }

    @Override
    public String toString() {
        return "Device: '" + name + '\'' +
                        ", powerConsumption=" + powerConsumption +
                        ", status=" + status +
                        '}';
    }
}
