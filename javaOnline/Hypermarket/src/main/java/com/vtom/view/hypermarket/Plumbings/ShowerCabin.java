package com.vtom.view.hypermarket.Plumbings;

import com.vtom.view.hypermarket.Plumbing;

public class ShowerCabin extends Plumbing {

    public ShowerCabin(double price,
                       String manufacturer,
                       MaterialType materialType) {
        super(price, manufacturer, materialType);
    }


    @Override
    public String toString() {
        return "ShowerCabin{" +
                super.toString() +
                '}';
    }
}
