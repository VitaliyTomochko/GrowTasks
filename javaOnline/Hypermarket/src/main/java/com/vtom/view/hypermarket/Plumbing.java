package com.vtom.view.hypermarket;

import com.vtom.view.hypermarket.Plumbings.Sink;

import java.util.function.Predicate;

public abstract class Plumbing implements Category {

    public final static Predicate<Category> onlySinks = category -> {
        boolean result = category instanceof Sink;
        return result;
    };
    private final double price;
    private final String manufacturer;
    private final MaterialType materialType;
    public Plumbing(double price, String manufacturer, MaterialType materialType) {

        this.materialType = materialType;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public static Predicate<Category> buildFilter(double price) {
        return category -> category.getPrice() < price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    @Override
    public String toString() {
        return " price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", materialType=" + materialType;
    }

    public enum MaterialType {
        Ceramic,
        StainlessSteel,
        Granite;
    }
}
