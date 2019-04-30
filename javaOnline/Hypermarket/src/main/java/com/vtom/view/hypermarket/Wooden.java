package com.vtom.view.hypermarket;

public abstract class Wooden implements Category {


    private final double price;
    private final String manufacturer;
    private final WoodType woodType;

    public Wooden(double price, String manufacturer, WoodType woodType) {

        this.woodType = woodType;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }


    public enum WoodType {
        Oak,
        Birch,
        Beech,
        Pine;
    }
}
