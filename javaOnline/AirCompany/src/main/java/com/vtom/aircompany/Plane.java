package com.vtom.aircompany;

public class Plane {

    private int seatsAmount;
    private int loadCapacity;
    private int fuelAmount;
    private int distance;
    private PlaneType planeType;

    public Plane(int seatsAmount, int loadCapacity, int fuelAmount, int distance, PlaneType planeType) {
        this.seatsAmount = seatsAmount;
        this.loadCapacity = loadCapacity;
        this.fuelAmount = fuelAmount;
        this.distance = distance;
        this.planeType = planeType;
    }

    @Override
    public String toString() {
        return  planeType +
                " seatsAmount=" + seatsAmount +
                ", loadCapacity=" + loadCapacity +
                ", fuelAmount=" + fuelAmount +
                ", distance=" + distance +
                '}';
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }
}
