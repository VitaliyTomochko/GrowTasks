package com.vtom.view.hypermarket;

import java.util.Date;

public abstract class Paint implements Category {

    private final double price;
    private final String manufacturer;
    private final Date expirationDate;


    public Paint(double price,
                 String manufacturer,
                 Date expirationDate) {

        this.price = price;
        this.manufacturer = manufacturer;
        this.expirationDate = expirationDate;
    }

    @Override
    public double getPrice() {
        return price;
    }



}
